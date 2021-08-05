package typings.imageminJpegtran

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("imagemin-jpegtran", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var arithmetic: js.UndefOr[Boolean] = js.undefined
    
    var progressive: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArithmetic(value: Boolean): Self = StObject.set(x, "arithmetic", value.asInstanceOf[js.Any])
      
      inline def setArithmeticUndefined: Self = StObject.set(x, "arithmetic", js.undefined)
      
      inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    }
  }
}
