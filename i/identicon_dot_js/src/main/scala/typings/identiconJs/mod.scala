package typings.identiconJs

import typings.identiconJs.identiconJsStrings.png
import typings.identiconJs.identiconJsStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("identicon.js", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Identicon {
    def this(hash: String) = this()
    def this(hash: String, options: IdenticonOptions) = this()
    def this(hash: String, size: Double) = this()
  }
  
  type Color = js.Tuple4[Double, Double, Double, Double]
  
  @js.native
  trait Identicon extends StObject {
    
    var background: Color = js.native
    
    var foreground: Color = js.native
    
    var format: svg | png = js.native
    
    var hash: String = js.native
    
    /**
      * Converts from hsl to rgb.
      * @param h hue
      * @param s saturation
      * @param b brightness
      */
    def hsl2rgb(h: Double, s: Double, b: Double): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Returns a new blank image as Svg or PNGlib.
      */
    def image(): Svg | PNGlib = js.native
    
    /**
      * Returns true if the identicon is a Svg.
      */
    def isSvg(): Boolean = js.native
    
    var margin: Double = js.native
    
    def rectangle(x: Double, y: Double, w: Double, h: Double, color: Color, image: PNGlib): Unit = js.native
    /**
      * Places a rectangle at the given position with the given width, height and color in the image.
      * @param x The x coordinate.
      * @param y The y coordinate
      * @param w The width.
      * @param h The height.
      * @param color The color.
      * @param image The image.
      */
    def rectangle(x: Double, y: Double, w: Double, h: Double, color: Color, image: Svg): Unit = js.native
    
    /**
      * Returns a new image as Svg or PNGlib with the identicon applied.
      */
    def render(): Svg | PNGlib = js.native
    
    var size: Double = js.native
  }
  
  trait IdenticonOptions extends StObject {
    
    var background: js.UndefOr[Color] = js.undefined
    
    var foreground: js.UndefOr[Color] = js.undefined
    
    var format: js.UndefOr[svg | png] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object IdenticonOptions {
    
    inline def apply(): IdenticonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdenticonOptions]
    }
    
    extension [Self <: IdenticonOptions](x: Self) {
      
      inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setForeground(value: Color): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setFormat(value: svg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait PNGlib extends StObject {
    
    var depth: Double
    
    /**
      * Returns the image as a base64 encoded string.
      */
    def getBase64(): String
    
    /**
      * Returns the png as a string.
      */
    def getDump(): String
    
    var height: Double
    
    /**
      * Returns the index of a given pixel in the image data array.
      * @param x The given x coordinate of the pixel.
      * @param y The given y coordinate of the pixel.
      */
    def index(x: Double, y: Double): Double
    
    var width: Double
  }
  object PNGlib {
    
    inline def apply(
      depth: Double,
      getBase64: () => String,
      getDump: () => String,
      height: Double,
      index: (Double, Double) => Double,
      width: Double
    ): PNGlib = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), height = height.asInstanceOf[js.Any], index = js.Any.fromFunction2(index), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PNGlib]
    }
    
    extension [Self <: PNGlib](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setGetBase64(value: () => String): Self = StObject.set(x, "getBase64", js.Any.fromFunction0(value))
      
      inline def setGetDump(value: () => String): Self = StObject.set(x, "getDump", js.Any.fromFunction0(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: (Double, Double) => Double): Self = StObject.set(x, "index", js.Any.fromFunction2(value))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Svg extends StObject {
    
    var background: Color
    
    /**
      * Returns a string with the structure 'rgb(r, g, b, a)'.
      * @param red
      * @param green
      * @param blue
      * @param alpha
      */
    def color(red: Double, green: Double, blue: Double, alpha: Double): String
    
    var foreground: Color
    
    /**
      * Returns the Svg as a base64 encoded string.
      */
    def getBase64(): String
    
    /**
      * Returns the Svg as string.
      */
    def getDump(): String
    
    var rectangles: js.Array[typings.identiconJs.anon.Color]
    
    var size: Double
  }
  object Svg {
    
    inline def apply(
      background: Color,
      color: (Double, Double, Double, Double) => String,
      foreground: Color,
      getBase64: () => String,
      getDump: () => String,
      rectangles: js.Array[typings.identiconJs.anon.Color],
      size: Double
    ): Svg = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = js.Any.fromFunction4(color), foreground = foreground.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), rectangles = rectangles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    extension [Self <: Svg](x: Self) {
      
      inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setColor(value: (Double, Double, Double, Double) => String): Self = StObject.set(x, "color", js.Any.fromFunction4(value))
      
      inline def setForeground(value: Color): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setGetBase64(value: () => String): Self = StObject.set(x, "getBase64", js.Any.fromFunction0(value))
      
      inline def setGetDump(value: () => String): Self = StObject.set(x, "getDump", js.Any.fromFunction0(value))
      
      inline def setRectangles(value: js.Array[typings.identiconJs.anon.Color]): Self = StObject.set(x, "rectangles", value.asInstanceOf[js.Any])
      
      inline def setRectanglesVarargs(value: typings.identiconJs.anon.Color*): Self = StObject.set(x, "rectangles", js.Array(value :_*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
