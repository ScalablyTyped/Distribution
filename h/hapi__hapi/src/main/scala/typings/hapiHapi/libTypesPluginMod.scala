package typings.hapiHapi

import typings.hapiHapi.anon.Bind
import typings.hapiHapi.anon.Hapi
import typings.hapiHapi.anon.Route
import typings.hapiHapi.anon.Vhost
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.RequestRoute
import typings.hapiHapi.libTypesRouteMod.RouteOptions
import typings.hapiHapi.libTypesServerMod.Server_
import typings.hapiHapi.libTypesServerServerMod.ServerApplicationState
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.Method
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPluginMod {
  
  type DecorateName = String | js.Symbol
  
  @js.native
  trait DecorationMethod[T] extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type Dependencies = String | js.Array[String] | (Record[String, String])
  
  @js.native
  trait HandlerDecorationMethod extends StObject {
    
    def apply(route: RequestRoute[ReqRefDefaults], options: Any): Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]] = js.native
    
    var defaults: js.UndefOr[
        RouteOptions[ReqRefDefaults] | (js.Function1[/* method */ Any, RouteOptions[ReqRefDefaults]])
      ] = js.native
  }
  
  type Plugin[T, D] = (PluginNameVersion & (PluginBase[T, D])) | (PluginPackage & (PluginBase[T, D]))
  
  trait PluginBase[T, D] extends StObject {
    
    /**
      * We need to use D within the PluginBase type to be able to infer it later on,
      * but this property has no concrete existence in the code.
      *
      * See https://github.com/Microsoft/TypeScript/wiki/FAQ#why-doesnt-type-inference-work-on-this-interface-interface-foot-- for details.
      */
    @JSName("___$type_of_plugin_decorations$___")
    var ___Dollartype_of_plugin_decorationsDollar___ : js.UndefOr[D] = js.undefined
    
    /** (optional) a string or an array of strings indicating a plugin dependency. Same as setting dependencies via server.dependency(). */
    var dependencies: js.UndefOr[Dependencies] = js.undefined
    
    /** (optional) if true, allows the plugin to be registered multiple times with the same server. Defaults to false. */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** once - (optional) if true, will only register the plugin once per server. If set, overrides the once option passed to server.register(). Defaults to no override. */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (required) the registration function with the signature async function(server, options) where:
      * * server - the server object with a plugin-specific server.realm.
      * * options - any options passed to the plugin during registration via server.register().
      */
    def register(server: Server_[ServerApplicationState], options: T): Unit | js.Promise[Unit]
    
    /**
      * Allows defining semver requirements for node and hapi.
      * @default Allows all.
      */
    var requirements: js.UndefOr[Hapi] = js.undefined
  }
  object PluginBase {
    
    inline def apply[T, D](register: (Server_[ServerApplicationState], T) => Unit | js.Promise[Unit]): PluginBase[T, D] = {
      val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[PluginBase[T, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginBase[?, ?], T, D] (val x: Self & (PluginBase[T, D])) extends AnyVal {
      
      inline def setDependencies(value: Dependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setRegister(value: (Server_[ServerApplicationState], T) => Unit | js.Promise[Unit]): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      inline def setRequirements(value: Hapi): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
      
      inline def set___Dollartype_of_plugin_decorationsDollar___(value: D): Self = StObject.set(x, "___$type_of_plugin_decorations$___", value.asInstanceOf[js.Any])
      
      inline def set___Dollartype_of_plugin_decorationsDollar___Undefined: Self = StObject.set(x, "___$type_of_plugin_decorations$___", js.undefined)
    }
  }
  
  trait PluginNameVersion extends StObject {
    
    /**
      * (required) the plugin name string. The name is used as a unique key. Published plugins (e.g. published in the npm
      * registry) should use the same name as the name field in their 'package.json' file. Names must be
      * unique within each application.
      */
    var name: String
    
    /**
      * optional plugin version. The version is only used informatively to enable other plugins to find out the versions loaded. The version should be the same as the one specified in the plugin's
      * 'package.json' file.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object PluginNameVersion {
    
    inline def apply(name: String): PluginNameVersion = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginNameVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginNameVersion] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait PluginPackage extends StObject {
    
    /**
      * Alternatively, the name and version can be included via the pkg property containing the 'package.json' file for the module which already has the name and version included
      */
    var pkg: PluginNameVersion
  }
  object PluginPackage {
    
    inline def apply(pkg: PluginNameVersion): PluginPackage = {
      val __obj = js.Dynamic.literal(pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginPackage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginPackage] (val x: Self) extends AnyVal {
      
      inline def setPkg(value: PluginNameVersion): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
  
  trait PluginProperties extends StObject
  
  trait PluginRegistered extends StObject {
    
    /**
      * the plugin name.
      */
    var name: String
    
    /**
      * options used to register the plugin.
      */
    var options: js.Object
    
    /**
      * the plugin version.
      */
    var version: String
  }
  object PluginRegistered {
    
    inline def apply(name: String, options: js.Object, version: String): PluginRegistered = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginRegistered]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginRegistered] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PluginSpecificConfiguration extends StObject
  
  trait PluginsListRegistered extends StObject
  
  trait PluginsStates extends StObject
  
  trait ServerRealm extends StObject {
    
    /** when the server object is provided as an argument to the plugin register() method, modifiers provides the registration preferences passed the server.register() method and includes: */
    var modifiers: Route
    
    /** the realm of the parent server object, or null for the root server. */
    var parent: ServerRealm | Null
    
    /** the active plugin name (empty string if at the server root). */
    var plugin: String
    
    /** the plugin options object passed at registration. */
    var pluginOptions: js.Object
    
    /** plugin-specific state to be shared only among activities sharing the same active state. plugins is an object where each key is a plugin name and the value is the plugin state. */
    var plugins: PluginsStates
    
    /** settings overrides */
    var settings: Bind
  }
  object ServerRealm {
    
    inline def apply(modifiers: Route, plugin: String, pluginOptions: js.Object, plugins: PluginsStates, settings: Bind): ServerRealm = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pluginOptions = pluginOptions.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[ServerRealm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerRealm] (val x: Self) extends AnyVal {
      
      inline def setModifiers(value: Route): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setParent(value: ServerRealm): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginOptions(value: js.Object): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: PluginsStates): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Bind): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerRegisterOptions extends StObject {
    
    /**
      * if true, subsequent registrations of the same plugin are skipped without error. Cannot be used with plugin options. Defaults to false. If not set to true, an error will be thrown the second
      * time a plugin is registered on the server.
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * modifiers applied to each route added by the plugin:
      */
    var routes: js.UndefOr[Vhost] = js.undefined
  }
  object ServerRegisterOptions {
    
    inline def apply(): ServerRegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerRegisterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerRegisterOptions] (val x: Self) extends AnyVal {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setRoutes(value: Vhost): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.libTypesPluginMod.ServerRegisterPluginObjectDirect[T, D]
    - typings.hapiHapi.libTypesPluginMod.ServerRegisterPluginObjectWrapped[T, D]
  */
  trait ServerRegisterPluginObject[T, D] extends StObject
  object ServerRegisterPluginObject {
    
    inline def ServerRegisterPluginObjectDirect[T, D](plugin: Plugin[T, D]): typings.hapiHapi.libTypesPluginMod.ServerRegisterPluginObjectDirect[T, D] = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hapiHapi.libTypesPluginMod.ServerRegisterPluginObjectDirect[T, D]]
    }
    
    inline def ServerRegisterPluginObjectWrapped[T, D](plugin: typings.hapiHapi.anon.Plugin[T, D]): typings.hapiHapi.libTypesPluginMod.ServerRegisterPluginObjectWrapped[T, D] = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.hapiHapi.libTypesPluginMod.ServerRegisterPluginObjectWrapped[T, D]]
    }
  }
  
  type ServerRegisterPluginObjectArray[T, U, V, W, X, Y, Z] = js.Array[ServerRegisterPluginObject[T | U | V | W | X | Y | Z, Unit]]
  
  trait ServerRegisterPluginObjectDirect[T, D]
    extends StObject
       with ServerRegisterOptions
       with ServerRegisterPluginObject[T, D] {
    
    /**
      * options passed to the plugin during registration.
      */
    var options: js.UndefOr[T] = js.undefined
    
    /**
      * a plugin object.
      */
    var plugin: Plugin[T, D]
  }
  object ServerRegisterPluginObjectDirect {
    
    inline def apply[T, D](plugin: Plugin[T, D]): ServerRegisterPluginObjectDirect[T, D] = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerRegisterPluginObjectDirect[T, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerRegisterPluginObjectDirect[?, ?], T, D] (val x: Self & (ServerRegisterPluginObjectDirect[T, D])) extends AnyVal {
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlugin(value: Plugin[T, D]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerRegisterPluginObjectWrapped[T, D]
    extends StObject
       with ServerRegisterOptions
       with ServerRegisterPluginObject[T, D] {
    
    /**
      * options passed to the plugin during registration.
      */
    var options: js.UndefOr[T] = js.undefined
    
    /**
      * a plugin object.
      */
    var plugin: typings.hapiHapi.anon.Plugin[T, D]
  }
  object ServerRegisterPluginObjectWrapped {
    
    inline def apply[T, D](plugin: typings.hapiHapi.anon.Plugin[T, D]): ServerRegisterPluginObjectWrapped[T, D] = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerRegisterPluginObjectWrapped[T, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerRegisterPluginObjectWrapped[?, ?], T, D] (val x: Self & (ServerRegisterPluginObjectWrapped[T, D])) extends AnyVal {
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlugin(value: typings.hapiHapi.anon.Plugin[T, D]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
}
