package typings.liftoff

import org.scalablytyped.runtime.StringDictionary
import typings.fined.mod.PathSpec
import typings.liftoff.liftoffStrings.loaderColonfailure
import typings.liftoff.liftoffStrings.loaderColonsuccess
import typings.liftoff.liftoffStrings.preloadColonbefore
import typings.liftoff.liftoffStrings.preloadColonfailure
import typings.liftoff.liftoffStrings.preloadColonsuccess
import typings.liftoff.liftoffStrings.respawn
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.Process
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("liftoff", JSImport.Namespace)
  @js.native
  /**
    * Create an instance of Liftoff to invoke your application.
    */
  open class ^ () extends Liftoff {
    def this(options: Options) = this()
  }
  
  trait Events extends StObject {
    
    @JSName("loader:failure")
    def loaderColonfailure(name: String, err: js.Error): Unit
    
    @JSName("loader:success")
    def loaderColonsuccess(name: String, module: Any): Unit
    
    @JSName("preload:before")
    def preloadColonbefore(name: String): Unit
    
    @JSName("preload:failure")
    def preloadColonfailure(name: String, err: js.Error): Unit
    
    @JSName("preload:success")
    def preloadColonsuccess(name: String, module: Any): Unit
    
    def respawn(flags: js.Array[String], child: Process): Unit
  }
  object Events {
    
    inline def apply(
      loaderColonfailure: (String, js.Error) => Unit,
      loaderColonsuccess: (String, Any) => Unit,
      preloadColonbefore: String => Unit,
      preloadColonfailure: (String, js.Error) => Unit,
      preloadColonsuccess: (String, Any) => Unit,
      respawn: (js.Array[String], Process) => Unit
    ): Events = {
      val __obj = js.Dynamic.literal(respawn = js.Any.fromFunction2(respawn))
      __obj.updateDynamic("loader:failure")(js.Any.fromFunction2(loaderColonfailure))
      __obj.updateDynamic("loader:success")(js.Any.fromFunction2(loaderColonsuccess))
      __obj.updateDynamic("preload:before")(js.Any.fromFunction1(preloadColonbefore))
      __obj.updateDynamic("preload:failure")(js.Any.fromFunction2(preloadColonfailure))
      __obj.updateDynamic("preload:success")(js.Any.fromFunction2(preloadColonsuccess))
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      inline def setLoaderColonfailure(value: (String, js.Error) => Unit): Self = StObject.set(x, "loader:failure", js.Any.fromFunction2(value))
      
      inline def setLoaderColonsuccess(value: (String, Any) => Unit): Self = StObject.set(x, "loader:success", js.Any.fromFunction2(value))
      
      inline def setPreloadColonbefore(value: String => Unit): Self = StObject.set(x, "preload:before", js.Any.fromFunction1(value))
      
      inline def setPreloadColonfailure(value: (String, js.Error) => Unit): Self = StObject.set(x, "preload:failure", js.Any.fromFunction2(value))
      
      inline def setPreloadColonsuccess(value: (String, Any) => Unit): Self = StObject.set(x, "preload:success", js.Any.fromFunction2(value))
      
      inline def setRespawn(value: (js.Array[String], Process) => Unit): Self = StObject.set(x, "respawn", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Liftoff extends EventEmitter {
    
    def addListener[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
    ): this.type = js.native
    
    def emit[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Liftoff.Events[TEvent]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
        ]
    ): Boolean = js.native
    
    def execute(
      env: LiftoffEnv,
      callback: js.ThisFunction2[/* this */ this.type, /* env */ LiftoffEnv, /* argv */ js.Array[String], Unit]
    ): Unit = js.native
    def execute(
      env: LiftoffEnv,
      forcedFlags: String,
      callback: js.ThisFunction2[/* this */ this.type, /* env */ LiftoffEnv, /* argv */ js.Array[String], Unit]
    ): Unit = js.native
    def execute(
      env: LiftoffEnv,
      forcedFlags: js.Array[String],
      callback: js.ThisFunction2[/* this */ this.type, /* env */ LiftoffEnv, /* argv */ js.Array[String], Unit]
    ): Unit = js.native
    
    def listeners[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](event: TEvent): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
      ] = js.native
    
    def off[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
    ): this.type = js.native
    
    def on[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
    ): this.type = js.native
    
    def once[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
    ): this.type = js.native
    
    def prepare(options: PrepareOptions, callback: js.Function1[/* env */ LiftoffEnv, Unit]): Unit = js.native
    
    def prependListener[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
    ): this.type = js.native
    
    def rawListeners[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](event: TEvent): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
      ] = js.native
    
    def removeListener[TEvent /* <: /* keyof liftoff.liftoff.Events */ loaderColonsuccess | preloadColonsuccess | loaderColonfailure | preloadColonfailure | preloadColonbefore | respawn */](
      event: TEvent,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: liftoff.liftoff.Events[TEvent] */ js.Any
    ): this.type = js.native
  }
  
  trait LiftoffEnv extends StObject {
    
    var completion: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The paths and contents of the found config files.
      */
    var config: StringDictionary[Any]
    
    /**
      * the base directory of your configuration file (if found)
      */
    var configBase: js.UndefOr[String] = js.undefined
    
    /**
      * an object of filepaths for each found config file (filepath values will be null if not found)
      */
    var configFiles: StringDictionary[StringDictionary[String | Null]]
    
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
    var modulePackage: StringDictionary[Any]
    
    /**
      * the full path to the local module your project relies on (if found)
      */
    var modulePath: js.UndefOr[String] = js.undefined
    
    /**
      * an array of modules that liftoff tried to pre-load
      */
    var preload: js.Array[String]
  }
  object LiftoffEnv {
    
    inline def apply(
      config: StringDictionary[Any],
      configFiles: StringDictionary[StringDictionary[String | Null]],
      configNameSearch: js.Array[String],
      cwd: String,
      modulePackage: StringDictionary[Any],
      preload: js.Array[String]
    ): LiftoffEnv = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configFiles = configFiles.asInstanceOf[js.Any], configNameSearch = configNameSearch.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], modulePackage = modulePackage.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiftoffEnv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiftoffEnv] (val x: Self) extends AnyVal {
      
      inline def setCompletion(value: Boolean): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setConfig(value: StringDictionary[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigBase(value: String): Self = StObject.set(x, "configBase", value.asInstanceOf[js.Any])
      
      inline def setConfigBaseUndefined: Self = StObject.set(x, "configBase", js.undefined)
      
      inline def setConfigFiles(value: StringDictionary[StringDictionary[String | Null]]): Self = StObject.set(x, "configFiles", value.asInstanceOf[js.Any])
      
      inline def setConfigNameSearch(value: js.Array[String]): Self = StObject.set(x, "configNameSearch", value.asInstanceOf[js.Any])
      
      inline def setConfigNameSearchVarargs(value: String*): Self = StObject.set(x, "configNameSearch", js.Array(value*))
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setModulePackage(value: StringDictionary[Any]): Self = StObject.set(x, "modulePackage", value.asInstanceOf[js.Any])
      
      inline def setModulePath(value: String): Self = StObject.set(x, "modulePath", value.asInstanceOf[js.Any])
      
      inline def setModulePathUndefined: Self = StObject.set(x, "modulePath", js.undefined)
      
      inline def setPreload(value: js.Array[String]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadVarargs(value: String*): Self = StObject.set(x, "preload", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A method to handle bash/zsh/whatever completions.
      * @default null
      */
    var completions: js.UndefOr[js.Function1[/* completion */ String, Any]] = js.undefined
    
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
    var extensions: js.UndefOr[String | js.Array[String] | (StringDictionary[String | Null])] = js.undefined
    
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
        js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ Any, /* flags */ js.Array[String], Unit], Unit])
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompletions(value: /* completion */ String => Any): Self = StObject.set(x, "completions", js.Any.fromFunction1(value))
      
      inline def setCompletionsUndefined: Self = StObject.set(x, "completions", js.undefined)
      
      inline def setConfigFiles(value: StringDictionary[StringDictionary[String | PathSpec]]): Self = StObject.set(x, "configFiles", value.asInstanceOf[js.Any])
      
      inline def setConfigFilesUndefined: Self = StObject.set(x, "configFiles", js.undefined)
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setConfigNameUndefined: Self = StObject.set(x, "configName", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String] | (StringDictionary[String | Null])): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProcessTitle(value: String): Self = StObject.set(x, "processTitle", value.asInstanceOf[js.Any])
      
      inline def setProcessTitleUndefined: Self = StObject.set(x, "processTitle", js.undefined)
      
      inline def setV8flags(
        value: js.Array[String] | (js.Function1[/* cb */ js.Function2[/* err */ Any, /* flags */ js.Array[String], Unit], Unit])
      ): Self = StObject.set(x, "v8flags", value.asInstanceOf[js.Any])
      
      inline def setV8flagsFunction1(value: /* cb */ js.Function2[/* err */ Any, /* flags */ js.Array[String], Unit] => Unit): Self = StObject.set(x, "v8flags", js.Any.fromFunction1(value))
      
      inline def setV8flagsUndefined: Self = StObject.set(x, "v8flags", js.undefined)
      
      inline def setV8flagsVarargs(value: String*): Self = StObject.set(x, "v8flags", js.Array(value*))
    }
  }
  
  trait PrepareOptions extends StObject {
    
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
      * A string or array of modules to attempt requiring from the local
      * working directory before invoking the launch callback.
      * @default null
      */
    var preload: js.UndefOr[String | js.Array[Any]] = js.undefined
  }
  object PrepareOptions {
    
    inline def apply(): PrepareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrepareOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrepareOptions] (val x: Self) extends AnyVal {
      
      inline def setCompletion(value: String): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setPreload(value: String | js.Array[Any]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setPreloadVarargs(value: Any*): Self = StObject.set(x, "preload", js.Array(value*))
    }
  }
}
