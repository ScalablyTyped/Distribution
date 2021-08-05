package typings.imageminOptipng

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("imagemin-optipng", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var bitDepthReduction: js.UndefOr[Boolean] = js.undefined
    
    var colorTypeReduction: js.UndefOr[Boolean] = js.undefined
    
    var optimizationLevel: js.UndefOr[Double] = js.undefined
    
    var paletteReduction: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBitDepthReduction(value: Boolean): Self = StObject.set(x, "bitDepthReduction", value.asInstanceOf[js.Any])
      
      inline def setBitDepthReductionUndefined: Self = StObject.set(x, "bitDepthReduction", js.undefined)
      
      inline def setColorTypeReduction(value: Boolean): Self = StObject.set(x, "colorTypeReduction", value.asInstanceOf[js.Any])
      
      inline def setColorTypeReductionUndefined: Self = StObject.set(x, "colorTypeReduction", js.undefined)
      
      inline def setOptimizationLevel(value: Double): Self = StObject.set(x, "optimizationLevel", value.asInstanceOf[js.Any])
      
      inline def setOptimizationLevelUndefined: Self = StObject.set(x, "optimizationLevel", js.undefined)
      
      inline def setPaletteReduction(value: Boolean): Self = StObject.set(x, "paletteReduction", value.asInstanceOf[js.Any])
      
      inline def setPaletteReductionUndefined: Self = StObject.set(x, "paletteReduction", js.undefined)
    }
  }
}
