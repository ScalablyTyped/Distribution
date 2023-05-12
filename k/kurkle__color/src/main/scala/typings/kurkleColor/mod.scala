package typings.kurkleColor

import typings.kurkleColor.anon.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@kurkle/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def default(input: js.Array[Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def default(input: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def default(input: RGBA): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @JSImport("@kurkle/color", "Color")
  @js.native
  open class Color protected () extends StObject {
    /**
      * constructor
      * @param {Color|RGBA|string|number[]} input
      */
    def this(input: String) = this()
    def this(input: js.Array[Double]) = this()
    def this(input: Color) = this()
    def this(input: RGBA) = this()
    
    /**
      * @type {RGBA}
      * @hidden
      **/
    var _rgb: RGBA = js.native
    
    /**
      * @type {boolean}
      * @hidden
      **/
    var _valid: Boolean = js.native
    
    /**
      * Set aplha
      * @param {number} a - the alpha [0..1]
      */
    def alpha(a: Double): Color = js.native
    
    /**
      * Make clearer
      * @param {number} ratio - ratio [0..1]
      */
    def clearer(ratio: Double): Color = js.native
    
    /**
      * Darken
      * @param {number} ratio - ratio [0..1]
      */
    def darken(ratio: Double): Color = js.native
    
    /**
      * Desaturate
      * @param {number} ratio - ratio [0..1]
      */
    def desaturate(ratio: Double): Color = js.native
    
    /**
      * Convert to grayscale
      */
    def greyscale(): Color = js.native
    
    /**
      * hex string
      */
    def hexString(): String | RGBA = js.native
    
    /**
      * hsl(a) string
      */
    def hslString(): String = js.native
    
    /**
      * Lighten
      * @param {number} ratio - ratio [0..1]
      */
    def lighten(ratio: Double): Color = js.native
    
    /**
      * Mix another color to this color.
      * @param {Color} color - Color to mix in
      * @param {number} weight - 0..1
      */
    def mix(color: Color, weight: Double): Color = js.native
    
    def negate(): Color = js.native
    
    /**
      * Opaquer
      * @param {number} ratio - ratio [0..1]
      */
    def opaquer(ratio: Double): Color = js.native
    
    /**
      * @returns {RGBA} - the color
      */
    def rgb: RGBA = js.native
    
    /**
      * rgb(a) string
      */
    def rgbString(): String = js.native
    
    /**
      * @param {RGBA} obj - the color
      */
    def rgb_=(arg: RGBA): Unit = js.native
    
    /**
      * Rotate
      * @param {number} deg - degrees to rotate
      */
    def rotate(deg: Double): Color = js.native
    
    /**
      * Saturate
      * @param {number} ratio - ratio [0..1]
      */
    def saturate(ratio: Double): Color = js.native
    
    /**
      * `true` if this is a valid color
      * @returns {boolean}
      */
    def valid: Boolean = js.native
  }
  
  inline def b2n(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("b2n")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def b2p(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("b2p")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexParse(str: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("hexParse")(str.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def hexString(v: RGBA): String | RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("hexString")(v.asInstanceOf[js.Any]).asInstanceOf[String | RGBA]
  
  inline def hsl2rgb(h: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def hsl2rgb(h: js.Array[Double], s: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsl2rgb(h: js.Array[Double], s: Double, l: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsl2rgb(h: js.Array[Double], s: Unit, l: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsl2rgb(h: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def hsl2rgb(h: Double, s: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsl2rgb(h: Double, s: Double, l: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsl2rgb(h: Double, s: Unit, l: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def hslString(v: RGBA): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslString")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hsv2rgb(h: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def hsv2rgb(h: js.Array[Double], s: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsv2rgb(h: js.Array[Double], s: Double, v: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsv2rgb(h: js.Array[Double], s: Unit, v: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsv2rgb(h: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def hsv2rgb(h: Double, s: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsv2rgb(h: Double, s: Double, v: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hsv2rgb(h: Double, s: Unit, v: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hsv2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def hueParse(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("hueParse")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
  
  inline def hwb2rgb(h: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def hwb2rgb(h: js.Array[Double], w: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hwb2rgb(h: js.Array[Double], w: Double, b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any], w.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hwb2rgb(h: js.Array[Double], w: Unit, b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any], w.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hwb2rgb(h: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def hwb2rgb(h: Double, w: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hwb2rgb(h: Double, w: Double, b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any], w.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def hwb2rgb(h: Double, w: Unit, b: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("hwb2rgb")(h.asInstanceOf[js.Any], w.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def n2b(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("n2b")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def n2p(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("n2p")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nameParse(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("nameParse")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
  
  inline def p2b(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("p2b")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rgb2hsl(v: RGBA): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsl")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def rgbParse(str: String): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbParse")(str.asInstanceOf[js.Any]).asInstanceOf[RGBA]
  
  inline def rgbString(v: RGBA): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbString")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rotate(v: RGBA, deg: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(v.asInstanceOf[js.Any], deg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def round(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait RGBA extends StObject {
    
    /**
      * - alpha [0..1]
      */
    var a: Double
    
    /**
      * - blue [0..255]
      */
    var b: Double
    
    /**
      * - green [0..255]
      */
    var g: Double
    
    /**
      * - red [0..255]
      */
    var r: Double
  }
  object RGBA {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
