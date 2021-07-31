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
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectBrowsers(value: KarmaDetectBrowsers): Self = StObject.set(x, "detectBrowsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectBrowsersUndefined: Self = StObject.set(x, "detectBrowsers", js.undefined)
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
    
    @scala.inline
    def apply(postDetection: js.Array[String] => js.Array[String]): KarmaDetectBrowsers = {
      val __obj = js.Dynamic.literal(postDetection = js.Any.fromFunction1(postDetection))
      __obj.asInstanceOf[KarmaDetectBrowsers]
    }
    
    @scala.inline
    implicit class KarmaDetectBrowsersMutableBuilder[Self <: KarmaDetectBrowsers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPostDetection(value: js.Array[String] => js.Array[String]): Self = StObject.set(x, "postDetection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreferHeadless(value: Boolean): Self = StObject.set(x, "preferHeadless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferHeadlessUndefined: Self = StObject.set(x, "preferHeadless", js.undefined)
      
      @scala.inline
      def setUsePhantomJS(value: Boolean): Self = StObject.set(x, "usePhantomJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePhantomJSUndefined: Self = StObject.set(x, "usePhantomJS", js.undefined)
    }
  }
}
