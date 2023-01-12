package typings.imageminUpng

import typings.imagemin.mod.Plugin
import typings.imageminUpng.mod.process.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * upng imagemin plugin
      */
    inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
    inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
    
    @JSImport("imagemin-upng", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object process {
    
    trait Options extends StObject {
      
      /**
        * number of colors in the result (0 = lossless, 256 = lossy).
        * @default 256
        */
      var cnum: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setCnum(value: Double): Self = StObject.set(x, "cnum", value.asInstanceOf[js.Any])
        
        inline def setCnumUndefined: Self = StObject.set(x, "cnum", js.undefined)
      }
    }
  }
}
