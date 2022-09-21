package typings.matrixAppserviceBridge

import typings.matrixAppservice.mod.AppServiceRegistration
import typings.matrixAppserviceBridge.anon.AffectsRegistration
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli")
  @js.native
  open class Cli[ConfigType /* <: Record[String, Any] */] protected () extends StObject {
    /**
      * @constructor
      * @param opts CLI options
      */
    def this(opts: CliOpts[ConfigType]) = this()
    
    /* private */ var args: Any = js.native
    
    /* private */ var assignConfigFile: Any = js.native
    
    /* private */ var bridgeConfig: Any = js.native
    
    /* private */ var generateRegistration: Any = js.native
    
    /**
      * Get the parsed arguments. Only set after run is called and arguments parsed.
      * @return The parsed arguments
      */
    def getArgs(): CliArgs | Null = js.native
    
    /**
      * Get the loaded and parsed bridge config. Only set after run() has been called.
      * @return The config
      */
    def getConfig(): ConfigType | Null = js.native
    
    /**
      * Get the path to the registration file. This may be different to the one supplied
      * in the constructor if the user passed a -f flag.
      * @return The path to the registration file.
      */
    def getRegistrationFilePath(): String = js.native
    
    /* private */ var loadConfig: Any = js.native
    
    /* private */ var loadYaml: Any = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var printHelp: Any = js.native
    
    /**
      * Run the app from the command line. Will parse sys args.
      */
    def run(): Unit = js.native
    def run(args: CliArgs): Unit = js.native
    
    /* private */ var startWithConfig: Any = js.native
  }
  /* static members */
  object Cli {
    
    @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli.DEFAULT_FILENAME")
    @js.native
    def DEFAULT_FILENAME: String = js.native
    inline def DEFAULT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FILENAME")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge/lib/components/cli", "Cli.DEFAULT_WATCH_INTERVAL")
    @js.native
    def DEFAULT_WATCH_INTERVAL: Double = js.native
    inline def DEFAULT_WATCH_INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_WATCH_INTERVAL")(x.asInstanceOf[js.Any])
  }
  
  trait CliArgs extends StObject {
    
    var config: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var `generate-registration`: js.UndefOr[Boolean] = js.undefined
    
    var help: js.UndefOr[Boolean] = js.undefined
    
    var localpart: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object CliArgs {
    
    inline def apply(): CliArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CliArgs]
    }
    
    extension [Self <: CliArgs](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def `setGenerate-registration`(value: Boolean): Self = StObject.set(x, "generate-registration", value.asInstanceOf[js.Any])
      
      inline def `setGenerate-registrationUndefined`: Self = StObject.set(x, "generate-registration", js.undefined)
      
      inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLocalpart(value: String): Self = StObject.set(x, "localpart", value.asInstanceOf[js.Any])
      
      inline def setLocalpartUndefined: Self = StObject.set(x, "localpart", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait CliOpts[ConfigType /* <: Record[String, Any] */] extends StObject {
    
    /**
      * Bridge-specific config info. If not defined, --config option will not be present in the CLI
      */
    var bridgeConfig: js.UndefOr[AffectsRegistration] = js.native
    
    /**
      * Enable '--localpart [-l]' to allow users to configure the bot localpart.
      * @default true
      */
    var enableLocalpart: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable '--generate-registration' to allow users to generate a registration file.
      * @default true
      */
    var enableRegistration: js.UndefOr[Boolean] = js.native
    
    /**
      * The function called when you should generate a registration.
      * Must be defined unless `enableRegistration` is `false`.
      */
    var generateRegistration: js.UndefOr[
        js.Function2[
          /* reg */ AppServiceRegistration, 
          /* cb */ js.Function1[/* finalReg */ AppServiceRegistration, Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Don't ask user for appservice url when generating registration.
      * @default false
      */
    var noUrl: js.UndefOr[Boolean] = js.native
    
    /**
      * This function is when the config is hot-reloaded. If not defined, hot-reloading is disabled.
      *
      * You can hot-reload the bridge by sending a SIGHUP signal to the bridge.
      */
    var onConfigChanged: js.UndefOr[js.Function1[/* config */ ConfigType, Unit]] = js.native
    
    /**
      * The path to write the registration file to. Users can overwrite this with -f.
      * @default "registration.yaml"
      */
    var registrationPath: js.UndefOr[String] = js.native
    
    /**
      * This function called when you should run the bridge.
      */
    def run(): Unit = js.native
    def run(port: Double): Unit = js.native
    def run(port: Double, config: ConfigType): Unit = js.native
    def run(port: Double, config: ConfigType, registration: AppServiceRegistration): Unit = js.native
    def run(port: Double, config: Null, registration: AppServiceRegistration): Unit = js.native
    def run(port: Null, config: ConfigType): Unit = js.native
    def run(port: Null, config: ConfigType, registration: AppServiceRegistration): Unit = js.native
    def run(port: Null, config: Null, registration: AppServiceRegistration): Unit = js.native
  }
}
