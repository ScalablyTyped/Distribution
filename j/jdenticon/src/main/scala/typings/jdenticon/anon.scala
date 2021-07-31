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
    
    @scala.inline
    def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setGrayscale(value: js.Array[Double]): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
      
      @scala.inline
      def setGrayscaleVarargs(value: Double*): Self = StObject.set(x, "grayscale", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): Grayscale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grayscale]
    }
    
    @scala.inline
    implicit class GrayscaleMutableBuilder[Self <: Grayscale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Double): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setGrayscale(value: Double): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
    }
  }
}
