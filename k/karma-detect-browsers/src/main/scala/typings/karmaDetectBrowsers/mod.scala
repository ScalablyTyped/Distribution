package typings.karmaDetectBrowsers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait ConfigOptions extends StObject {
    
    /**
      * See https://github.com/karma-runner/karma-coverage/blob/master/docs/configuration.md
      */
    var detectBrowsers: js.UndefOr[KarmaDetectBrowsers] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setDetectBrowsers(value: KarmaDetectBrowsers): Self = StObject.set(x, "detectBrowsers", value.asInstanceOf[js.Any])
      
      inline def setDetectBrowsersUndefined: Self = StObject.set(x, "detectBrowsers", js.undefined)
    }
  }
  
  trait KarmaDetectBrowsers extends StObject {
    
    /** enable/disable, default is true */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * post processing of browsers list
      * here you can edit the list of browsers used by karma
      */
    def postDetection(availableBrowsers: js.Array[String]): js.Array[String]
    
    /** use headless mode, for browsers that support it, default is false */
    var preferHeadless: js.UndefOr[Boolean] = js.undefined
    
    /** enable/disable phantomjs support, default is true */
    var usePhantomJS: js.UndefOr[Boolean] = js.undefined
  }
  object KarmaDetectBrowsers {
    
    inline def apply(postDetection: js.Array[String] => js.Array[String]): KarmaDetectBrowsers = {
      val __obj = js.Dynamic.literal(postDetection = js.Any.fromFunction1(postDetection))
      __obj.asInstanceOf[KarmaDetectBrowsers]
    }
    
    extension [Self <: KarmaDetectBrowsers](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPostDetection(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "postDetection", js.Any.fromFunction1(value))
      
      inline def setPreferHeadless(value: Boolean): Self = StObject.set(x, "preferHeadless", value.asInstanceOf[js.Any])
      
      inline def setPreferHeadlessUndefined: Self = StObject.set(x, "preferHeadless", js.undefined)
      
      inline def setUsePhantomJS(value: Boolean): Self = StObject.set(x, "usePhantomJS", value.asInstanceOf[js.Any])
      
      inline def setUsePhantomJSUndefined: Self = StObject.set(x, "usePhantomJS", js.undefined)
    }
  }
}
