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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var A: Double
    
    var B: Double
    
    var L: Double
    
    var a: Double
    
    var b: Double
    
    var c: Double
    
    var g: Double
    
    var h: Double
    
    var k: Double
    
    var m: Double
    
    var r: Double
    
    var s: Double
    
    var v: Double
    
    var y: Double
  }
  object A {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cmyk extends StObject {
    
    var cmyk: CMYK
    
    var hsl: HSL
    
    var hsv: HSV
    
    var lab: LAB
    
    var rgb: RGB
  }
  object Cmyk {
    
    inline def apply(cmyk: CMYK, hsl: HSL, hsv: HSV, lab: LAB, rgb: RGB): Cmyk = {
      val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cmyk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cmyk] (val x: Self) extends AnyVal {
      
      inline def setCmyk(value: CMYK): Self = StObject.set(x, "cmyk", value.asInstanceOf[js.Any])
      
      inline def setHsl(value: HSL): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      inline def setHsv(value: HSV): Self = StObject.set(x, "hsv", value.asInstanceOf[js.Any])
      
      inline def setLab(value: LAB): Self = StObject.set(x, "lab", value.asInstanceOf[js.Any])
      
      inline def setRgb(value: RGB): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[Color]
       with Instantiable1[/* r */ Double, Color]
       with Instantiable2[(/* r */ Double) | (/* r */ Unit), /* g */ Double, Color]
       with Instantiable3[
          (/* r */ Double) | (/* r */ Unit), 
          (/* g */ Double) | (/* g */ Unit), 
          /* b */ Double, 
          Color
        ]
       with Instantiable4[
          (/* r */ Double) | (/* r */ Unit), 
          (/* g */ Double) | (/* g */ Unit), 
          (/* b */ Double) | (/* b */ Unit), 
          /* a */ Double, 
          Color
        ]
}
