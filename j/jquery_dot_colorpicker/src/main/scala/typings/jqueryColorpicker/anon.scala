package typings.jqueryColorpicker

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.jqueryColorpicker.JQueryColorpickerStatic.CMYK
import typings.jqueryColorpicker.JQueryColorpickerStatic.Color
import typings.jqueryColorpicker.JQueryColorpickerStatic.HSL
import typings.jqueryColorpicker.JQueryColorpickerStatic.HSV
import typings.jqueryColorpicker.JQueryColorpickerStatic.LAB
import typings.jqueryColorpicker.JQueryColorpickerStatic.RGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait A extends StObject {
    
    var A: Double = js.native
    
    var B: Double = js.native
    
    var L: Double = js.native
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    var g: Double = js.native
    
    var h: Double = js.native
    
    var k: Double = js.native
    
    var m: Double = js.native
    
    var r: Double = js.native
    
    var s: Double = js.native
    
    var v: Double = js.native
    
    var y: Double = js.native
  }
  object A {
    
    @scala.inline
    def apply(
      A: Double,
      B: Double,
      L: Double,
      a: Double,
      b: Double,
      c: Double,
      g: Double,
      h: Double,
      k: Double,
      m: Double,
      r: Double,
      s: Double,
      v: Double,
      y: Double
    ): A = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], B = B.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    @scala.inline
    implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cmyk extends StObject {
    
    var cmyk: CMYK = js.native
    
    var hsl: HSL = js.native
    
    var hsv: HSV = js.native
    
    var lab: LAB = js.native
    
    var rgb: RGB = js.native
  }
  object Cmyk {
    
    @scala.inline
    def apply(cmyk: CMYK, hsl: HSL, hsv: HSV, lab: LAB, rgb: RGB): Cmyk = {
      val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cmyk]
    }
    
    @scala.inline
    implicit class CmykMutableBuilder[Self <: Cmyk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmyk(value: CMYK): Self = StObject.set(x, "cmyk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsl(value: HSL): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsv(value: HSV): Self = StObject.set(x, "hsv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLab(value: LAB): Self = StObject.set(x, "lab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgb(value: RGB): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable0[Color]
       with Instantiable1[/* r */ Double, Color]
       with Instantiable2[js.UndefOr[/* r */ Double], /* g */ Double, Color]
       with Instantiable3[js.UndefOr[/* r */ Double], js.UndefOr[/* g */ Double], /* b */ Double, Color]
       with Instantiable4[
          js.UndefOr[/* r */ Double], 
          js.UndefOr[/* g */ Double], 
          js.UndefOr[/* b */ Double], 
          /* a */ Double, 
          Color
        ]
}
