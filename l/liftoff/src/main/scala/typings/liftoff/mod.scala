package typings.liftoff

import org.scalablytyped.runtime.StringDictionary
import typings.fined.mod.PathSpec
import typings.interpret.mod.ExtensionDescriptor
import typings.interpret.mod.Extensions_
import typings.liftoff.liftoffStrings.require
import typings.liftoff.liftoffStrings.requireFail
import typings.liftoff.liftoffStrings.respawn
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("liftoff", JSImport.Namespace)
  @js.native
  /**
    * Create an instance of Liftoff to invoke your application.
    */
  class ^ () extends Liftoff {
    def this(options: Options) = this()
  }
  
  trait LaunchOptions extends StObject {
    
    var completion: js.UndefOr[String] = js.undefined
    
    /**
      * Don't search for a config, use the one provided.
      * **Note**: Liftoff will assume the current working directory is the directory containing the config file
      * unless an alternate location is explicitly specified using `cwd`.
      * @default null
      */
    var configPath: js.UndefOr[String] = js.undefined
    
    /**
      * Change the current working directory for this launch. Relative paths are calculated against `process.cwd()`.
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Allows you to force node or V8 flags during the launch.
      * This is useful if you need to make sure certain flags will always be enabled
      * or if you need to enable flags that don't show up in `opts.v8flags`
      * (as these flags aren't validated against opts.v8flags).
      * @default null
      */
    var forcedFlags: js.UndefOr[
        String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]])
      ] = js.undefined
    
    /**
      * A string or array of modules to attempt requiring from the local
      * working directory before invoking the launch callback.
      * @default null
      */
    var require: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  }
  object LaunchOptions {
    
    inline def apply(): LaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchOptions]
    }
    
    extension [Self <: LaunchOptions](x: Self) {
      
      inline def setCompletion(value: String): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setForcedFlags(value: String | js.Array[String] | (js.Function1[/* env */ LiftoffEnv, String | js.Array[String]])): Self = StObject.set(x, "forcedFlags", value.asInstanceOf[js.Any])
      
      inline def setForcedFlagsFunction1(value: /* env */ LiftoffEnv => String | js.Array[String]): Self = StObject.set(x, "forcedFlags", js.Any.fromFunction1(value))
      
      inline def setForcedFlagsUndefined: Self = StObject.set(x, "forcedFlags", js.undefined)
      
      inline def setForcedFlagsVarargs(value: String*): Self = StObject.set(x, "forcedFlags", js.Array(value :_*))
      
      inline def setRequire(value: String | js.Array[js.Any]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setRequireVarargs(value: js.Any*): Self = StObject.set(x, "require", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Liftoff extends EventEmitter {
    
    @JSName("addListener")
    def addListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
    
    // tslint:disable-line:ban-types
    @JSName("emit")
    def emit_require(event: require, name: String, module: ExtensionDescriptor): Boolean = js.native
    @JSName("emit")
    def emit_requireFail(event: requireFail, name: String, err: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_respawn(event: respawn, flags: js.Array[String], child: Process): Boolean = js.native
    
    /**
      * Launches your application with provided options, builds an environment,
      * and invokes your callback, passing the calculated environment as the first argument.
      */
    def launch(opts: LaunchOptions, callback: js.ThisFunction1[/* this */ this.type, /* env */ LiftoffEnv, Unit]): Unit = js.native
    
    @JSName("listenerCount")
    def listenerCount_require(`type`: require): Double = js.native
    @JSName("listenerCount")
    def listenerCount_requireFail(`type`: requireFail): Double = js.native
    @JSName("listenerCount")
    def listenerCount_respawn(`type`: respawn): Double = js.native
    
    @JSName("listeners")
    def listeners_require(event: require): js.Array[js.Function] = js.native
    @JSName("listeners")
    def listeners_requireFail(event: requireFail): js.Array[js.Function] = js.native
    @JSName("listeners")
    def listeners_respawn(event: respawn): js.Array[js.Function] = js.native
    
    @JSName("off")
    def off_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
    @JSName("off")
    def off_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
    @JSName("off")
    def off_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
    
    @JSName("on")
    def on_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
    @JSName("on")
    def on_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
    
    @JSName("once")
    def once_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
    @JSName("once")
    def once_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
    
    // tslint:disable-line:ban-types
    @JSName("rawListeners")
    def rawListeners_require(event: require): js.Array[js.Function] = js.native
    @JSName("rawListeners")
    def rawListeners_requireFail(event: requireFail): js.Array[js.Function] = js.native
    @JSName("rawListeners")
    def rawListeners_respawn(event: respawn): js.Array[js.Function] = js.native
    
    @JSName("removeAllListeners")
    def removeAllListeners_require(event: require): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_requireFail(event: requireFail): this.type = js.native
    @JSName("removeAllListeners")
    def removeAllListeners_respawn(event: respawn): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
  }
  
  trait LiftoffEnv extends StObject {
    
    /**
      * the base directory of your configuration file (if found)
      */
    var configBase: js.UndefOr[String] = js.undefined
    
    /**
      * an object of filepaths for each found config file (filepath values will be null if not found)
      */
    var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | Null]]] = js.undefined
    
    /**
      * the config files searched for
      */
    var configNameSearch: js.Array[String]
    
    /**
      * the full path to your configuration file (if found)
      */
    var configPath: js.UndefOr[String] = js.undefined
    
    /**
      * the current working directory
      */
    var cwd: String
    
    /**
      * the contents of the local module's package.json (if found)
      */
    var modulePackage: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    /**
      * the full path to the local module your project relies on (if found)
      */
    var modulePath: js.UndefOr[String] = js.undefined
    
    /**
      * an array of modules that liftoff tried to pre-load
      */
    var require: js.Array[String]
  }
  object LiftoffEnv {
    
    inline def apply(configNameSearch: js.Array[String], cwd: String, require: js.Array[String]): LiftoffEnv = {
      val __obj = js.Dynamic.literal(configNameSearch = configNameSearch.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiftoffEnv]
    }
    
    extension [Self <: LiftoffEnv](x: Self) {
      
      inline def setConfigBase(value: String): Self = StObject.set(x, "configBase", value.asInstanceOf[js.Any])
      
      inline def setConfigBaseUndefined: Self = StObject.set(x, "configBase", js.undefined)
      
      inline def setConfigFiles(value: StringDictionary[StringDictionary[String | Null]]): Self = StObject.set(x, "configFiles", value.asInstanceOf[js.Any])
      
      inline def setConfigFilesUndefined: Self = StObject.set(x, "configFiles", js.undefined)
      
      inline def setConfigNameSearch(value: js.Array[String]): Self = StObject.set(x, "configNameSearch", value.asInstanceOf[js.Any])
      
      inline def setConfigNameSearchVarargs(value: String*): Self = StObject.set(x, "configNameSearch", js.Array(value :_*))
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setModulePackage(value: StringDictionary[js.Any]): Self = StObject.set(x, "modulePackage", value.asInstanceOf[js.Any])
      
      inline def setModulePackageUndefined: Self = StObject.set(x, "modulePackage", js.undefined)
      
      inline def setModulePath(value: String): Self = StObject.set(x, "modulePath", value.asInstanceOf[js.Any])
      
      inline def setModulePathUndefined: Self = StObject.set(x, "modulePath", js.undefined)
      
      inline def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value :_*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A method to handle bash/zsh/whatever completions.
      * @default null
      */
    var completions: js.UndefOr[js.Function1[/* completion */ String, js.Any]] = js.undefined
    
    /**
      * An object of configuration files to find. Each property is keyed by the
      * default basename of the file being found, and the value is an object
      * of path arguments keyed by unique names.
      * @default null
      */
    var configFiles: js.UndefOr[StringDictionary[StringDictionary[String | PathSpec]]] = js.undefined
    
    /**
      * Sets the name of the configuration file Liftoff will attempt to find. Case-insensitive.
      * @default null
      */
    var configName: js.UndefOr[String] = js.undefined
    
    /**
      * Set extensions to include when searching for a configuration file.
      * If an external module is needed to load a given extension (e.g. .coffee),
      * the module name should be specified as the value for the key.
      * @default {".js":null,".json":null}
      */
    var extensions: js.UndefOr[Extensions_] = js.undefined
    
    /**
      * Sets which module your application expects to find locally when being run.
      * @default null
      */
    var moduleName: js.UndefOr[String] = js.undefined
    
    /**
      * Sugar for setting processTitle, moduleName, configName automatically.
      * @default null
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Sets what the process title will be.
      * @default null
      */
    var processTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Any flag specified here will be applied to node, not your program.
      * Useful for supporting invocations like myapp --harmony command,
      * where --harmony should be passed to node, not your program.
      * This functionality is implemented using flagged-respawn.
      * To support all v8flags, see `v8flags`.
      * @default null
      */
    var v8flags: js.UndefOr[
        js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit], Unit])
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCompletions(value: /* completion */ String => js.Any): Self = StObject.set(x, "completions", js.Any.fromFunction1(value))
      
      inline def setCompletionsUndefined: Self = StObject.set(x, "completions", js.undefined)
      
      inline def setConfigFiles(value: StringDictionary[StringDictionary[String | PathSpec]]): Self = StObject.set(x, "configFiles", value.asInstanceOf[js.Any])
      
      inline def setConfigFilesUndefined: Self = StObject.set(x, "configFiles", js.undefined)
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
      
      inline def setExtensions(value: Extensions_): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProcessTitle(value: String): Self = StObject.set(x, "processTitle", value.asInstanceOf[js.Any])
      
      inline def setProcessTitleUndefined: Self = StObject.set(x, "processTitle", js.undefined)
      
      inline def setV8flags(
        value: js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit], Unit])
      ): Self = StObject.set(x, "v8flags", value.asInstanceOf[js.Any])
      
      inline def setV8flagsFunction1(value: /* cb */ js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit] => Unit): Self = StObject.set(x, "v8flags", js.Any.fromFunction1(value))
      
      inline def setV8flagsUndefined: Self = StObject.set(x, "v8flags", js.undefined)
      
      inline def setV8flagsVarargs(value: String*): Self = StObject.set(x, "v8flags", js.Array(value :_*))
    }
  }
}
