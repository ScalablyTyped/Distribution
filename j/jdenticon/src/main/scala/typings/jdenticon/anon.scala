package typings.jdenticon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Color extends StObject {
    
    /**
      * Specifies the lightness range of colored shapes of an icon. The range is expressed as an array
      * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
      */
    var color: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Specifies the lightness range of grayscale shapes of an icon. The range is expressed as an array
      * containing two numbers, representing the minimum and maximum lightness in the range [0.0, 1.0].
      */
    var grayscale: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setGrayscale(value: js.Array[Double]): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
      
      inline def setGrayscaleVarargs(value: Double*): Self = StObject.set(x, "grayscale", js.Array(value*))
    }
  }
  
  trait Grayscale extends StObject {
    
    /**
      * Specifies the saturation of originally colored shapes of an icon. The saturation is expressed as a
      * number in the range [0.0, 1.0].
      */
    var color: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the saturation of originally grayscale shapes of an icon. The saturation is expressed as a
      * number in the range [0.0, 1.0].
      */
    var grayscale: js.UndefOr[Double] = js.undefined
  }
  object Grayscale {
    
    inline def apply(): Grayscale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grayscale]
    }
    
    extension [Self <: Grayscale](x: Self) {
      
      inline def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGrayscale(value: Double): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
    }
  }
}
