package typings.karmaBrowserify

import typings.browserify.mod.BrowserifyObject
import typings.browserify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait BrowserifyOptions
    extends StObject
       with Options {
    
    /**
      * You may perform additional configuration in a function passed as the configure option
      * and that receives the browserify instance as an argument.
      * See {@link https://github.com/nikku/karma-browserify#additional-bundle-configuration}
      */
    var configure: js.UndefOr[js.Function1[/* bundle */ BrowserifyObject, Unit]] = js.undefined
  }
  object BrowserifyOptions {
    
    inline def apply(): BrowserifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserifyOptions]
    }
    
    extension [Self <: BrowserifyOptions](x: Self) {
      
      inline def setConfigure(value: /* bundle */ BrowserifyObject => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      
      inline def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    }
  }
  
  trait ConfigOptions extends StObject {
    
    /**
      * Config entry to configure how the bundle gets created
      * see {@link https://github.com/nikku/karma-browserify#usage}
      */
    var browserify: js.UndefOr[BrowserifyOptions] = js.undefined
    
    /**
      * You can configure the underlying watchify instance
      * see {@link https://github.com/nikku/karma-browserify#watchify-config}
      */
    var watchify: js.UndefOr[WatchifyOptions] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setBrowserify(value: BrowserifyOptions): Self = StObject.set(x, "browserify", value.asInstanceOf[js.Any])
      
      inline def setBrowserifyUndefined: Self = StObject.set(x, "browserify", js.undefined)
      
      inline def setWatchify(value: WatchifyOptions): Self = StObject.set(x, "watchify", value.asInstanceOf[js.Any])
      
      inline def setWatchifyUndefined: Self = StObject.set(x, "watchify", js.undefined)
    }
  }
  
  type WatchifyOptions = typings.watchify.mod.Options
}
