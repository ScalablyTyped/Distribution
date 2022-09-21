package typings.gulpAngularProtractor

import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): ThroughStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ThroughStream]
  
  @JSImport("gulp-angular-protractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // See https://github.com/rochejul/gulp-angular-protractor/blob/master/readme.md#api
  trait Options extends StObject {
    
    /**
      * Arguments get passed directly to the protractor call [Read the docs for more information](https://github.com/angular/protractor/blob/master/docs/getting-started.md#setup-and-config)
      *
      * @default []
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If true, the plugin will update the WebDriver, launch the WebDriver server before launching tests and stop it at the end automatically
      *
      * @default true
      */
    var autoStartStopServer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path to your protractor config
      */
    var configFile: String
    
    /**
      * Enables Protractor's [debug mode](https://github.com/angular/protractor/blob/master/docs/debugging.md), which can be used to pause tests during execution and to view stack traces.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you want to use another protractor version instead the default one
      */
    var protractorModulePath: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    // See https://github.com/rochejul/gulp-angular-protractor/blob/master/examples/example-05/Gulpfile.js
    var webDriverStart: js.UndefOr[WebDriverStart] = js.undefined
    
    var webDriverUpdate: js.UndefOr[WebDriverUpdate] = js.undefined
  }
  object Options {
    
    inline def apply(configFile: String): Options = {
      val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setAutoStartStopServer(value: Boolean): Self = StObject.set(x, "autoStartStopServer", value.asInstanceOf[js.Any])
      
      inline def setAutoStartStopServerUndefined: Self = StObject.set(x, "autoStartStopServer", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setProtractorModulePath(value: String): Self = StObject.set(x, "protractorModulePath", value.asInstanceOf[js.Any])
      
      inline def setProtractorModulePathUndefined: Self = StObject.set(x, "protractorModulePath", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWebDriverStart(value: WebDriverStart): Self = StObject.set(x, "webDriverStart", value.asInstanceOf[js.Any])
      
      inline def setWebDriverStartUndefined: Self = StObject.set(x, "webDriverStart", js.undefined)
      
      inline def setWebDriverUpdate(value: WebDriverUpdate): Self = StObject.set(x, "webDriverUpdate", value.asInstanceOf[js.Any])
      
      inline def setWebDriverUpdateUndefined: Self = StObject.set(x, "webDriverUpdate", js.undefined)
    }
  }
  
  trait WebDriverStart extends StObject {
    
    /**
      * @default []
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
  }
  object WebDriverStart {
    
    inline def apply(): WebDriverStart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebDriverStart]
    }
    
    extension [Self <: WebDriverStart](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    }
  }
  
  trait WebDriverUpdate extends StObject {
    
    /**
      * Additional arguments to pass for the update of the webdriver
      *
      * @default []
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * List of browsers to update the webdriver
      *
      * @default ['chrome']
      */
    var browsers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @default false
      */
    var skip: js.UndefOr[Boolean] = js.undefined
  }
  object WebDriverUpdate {
    
    inline def apply(): WebDriverUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebDriverUpdate]
    }
    
    extension [Self <: WebDriverUpdate](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
}
