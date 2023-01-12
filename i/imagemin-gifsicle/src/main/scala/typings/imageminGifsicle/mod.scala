package typings.imageminGifsicle

import typings.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Imagemin plugin for {@link https://www.lcdf.org/gifsicle/|Gifsicle}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("imagemin-gifsicle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Reduce the number of distinct colors in each output GIF to num or less.
      * Num must be between 2 and 256.
      */
    var colors: js.UndefOr[Double] = js.undefined
    
    /**
      * Interlace gif for progressive rendering.
      * @default false
      */
    var interlaced: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Select an optimization level between 1 and 3.
      * @see {@link https://github.com/imagemin/imagemin-gifsicle#optimizationlevel}
      * @default 1
      */
    var optimizationLevel: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setInterlaced(value: Boolean): Self = StObject.set(x, "interlaced", value.asInstanceOf[js.Any])
      
      inline def setInterlacedUndefined: Self = StObject.set(x, "interlaced", js.undefined)
      
      inline def setOptimizationLevel(value: Double): Self = StObject.set(x, "optimizationLevel", value.asInstanceOf[js.Any])
      
      inline def setOptimizationLevelUndefined: Self = StObject.set(x, "optimizationLevel", js.undefined)
    }
  }
}
