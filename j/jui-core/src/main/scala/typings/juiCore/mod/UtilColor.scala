package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilColor extends js.Object {
  /**
    * convert hsv to rgb
    *
    * 		color.HSVtoRGB(0,0,1) === #FFFFF === { r : 255, g : 0, b : 0 }
    *
    * @param H  hue color number  (min : 0, max : 360)
    * @param S  Saturation number  (min : 0, max : 1)
    * @param V  Value number 		(min : 0, max : 1 )
    */
  def HSVtoRGB(H: Double, S: Double, V: Double): js.Any
  /**
    * convert rgb to hsv
    *
    * 		color.RGBtoHSV(0, 0, 255) === { h : 240, s : 1, v : 1 } === '#FFFF00'
    *
    * @param R  red color value
    * @param G  green color value
    * @param B  blue color value
    * @return  hsv color code
    */
  def RGBtoHSV(R: Double, G: Double, B: Double): js.Any
  /**
    * rgb 컬러 어두운 농도로 변환
    *
    * @param color   RGB color code
    * @param rate 어두운 농도
    */
  def darken(color: String, rate: Double): String
  /**
    * convert color to format string
    *
    *     // hex
    *     color.format({ r : 255, g : 255, b : 255 }, 'hex')  // #FFFFFF
    *
    *     // rgb
    *     color.format({ r : 255, g : 255, b : 255 }, 'rgb') // rgba(255, 255, 255, 0.5);
    *
    *     // rgba
    *     color.format({ r : 255, g : 255, b : 255, a : 0.5 }, 'rgb') // rgba(255, 255, 255, 0.5);
    *
    * @param obj  obj has r, g, b and a attributes
    * @param type  format string type
    */
  def format(obj: js.Any, `type`: String): String
  /**
    * rgb 컬러 밝은 농도로 변환
    *
    * @param color   RGB color code
    * @param rate 밝은 농도
    */
  def lighten(color: String, rate: Double): String
  /**
    * create color map
    *
    * 		var colorList = color.map(['#352a87', '#0f5cdd', '#00b5a6', '#ffc337', '#fdff00'], count)
    *
    * @param count  a divide number
    * @returns converted color list
    */
  def map(color_list: js.Array[String], count: Double): js.Array[String]
  /**
    * parse string to rgb color
    *
    * 		color.rgb("#FF0000") === { r : 255, g : 0, b : 0 }
    *
    * 		color.rgb("rgb(255, 0, 0)") == { r : 255, g : 0, b : }
    *
    * @param str color string
    * @returns  rgb object
    */
  def rgb(str: String): js.Any
  /**
    * get color scale
    *
    * 		var c = color.scale().domain('#FF0000', '#00FF00');
    *
    * 		// get middle color
    * 		c(0.5)   ==  #808000
    *
    * 		// get middle color list
    * 		c.ticks(20);  // return array ,    [startColor, ......, endColor ]
    *
    * @returns scale function
    */
  def scale(): ColorScale
}

object UtilColor {
  @scala.inline
  def apply(
    HSVtoRGB: (Double, Double, Double) => js.Any,
    RGBtoHSV: (Double, Double, Double) => js.Any,
    darken: (String, Double) => String,
    format: (js.Any, String) => String,
    lighten: (String, Double) => String,
    map: (js.Array[String], Double) => js.Array[String],
    rgb: String => js.Any,
    scale: () => ColorScale
  ): UtilColor = {
    val __obj = js.Dynamic.literal(HSVtoRGB = js.Any.fromFunction3(HSVtoRGB), RGBtoHSV = js.Any.fromFunction3(RGBtoHSV), darken = js.Any.fromFunction2(darken), format = js.Any.fromFunction2(format), lighten = js.Any.fromFunction2(lighten), map = js.Any.fromFunction2(map), rgb = js.Any.fromFunction1(rgb), scale = js.Any.fromFunction0(scale))
  
    __obj.asInstanceOf[UtilColor]
  }
}

