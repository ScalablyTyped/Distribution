package typings
package juiDashCoreLib.juiDashCoreMod

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
  def HSVtoRGB(H: scala.Double, S: scala.Double, V: scala.Double): js.Any
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
  def RGBtoHSV(R: scala.Double, G: scala.Double, B: scala.Double): js.Any
  /**
    * rgb 컬러 어두운 농도로 변환
    *
    * @param color   RGB color code
    * @param rate 어두운 농도
    */
  def darken(color: java.lang.String, rate: scala.Double): java.lang.String
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
  def format(obj: js.Any, `type`: java.lang.String): java.lang.String
  /**
    * rgb 컬러 밝은 농도로 변환
    *
    * @param color   RGB color code
    * @param rate 밝은 농도
    */
  def lighten(color: java.lang.String, rate: scala.Double): java.lang.String
  /**
    * create color map
    *
    * 		var colorList = color.map(['#352a87', '#0f5cdd', '#00b5a6', '#ffc337', '#fdff00'], count)
    *
    * @param count  a divide number
    * @returns converted color list
    */
  def map(color_list: js.Array[java.lang.String], count: scala.Double): js.Array[java.lang.String]
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
  def rgb(str: java.lang.String): js.Any
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
    HSVtoRGB: (scala.Double, scala.Double, scala.Double) => js.Any,
    RGBtoHSV: (scala.Double, scala.Double, scala.Double) => js.Any,
    darken: (java.lang.String, scala.Double) => java.lang.String,
    format: (js.Any, java.lang.String) => java.lang.String,
    lighten: (java.lang.String, scala.Double) => java.lang.String,
    map: (js.Array[java.lang.String], scala.Double) => js.Array[java.lang.String],
    rgb: java.lang.String => js.Any,
    scale: () => ColorScale
  ): UtilColor = {
    val __obj = js.Dynamic.literal(HSVtoRGB = js.Any.fromFunction3(HSVtoRGB), RGBtoHSV = js.Any.fromFunction3(RGBtoHSV), darken = js.Any.fromFunction2(darken), format = js.Any.fromFunction2(format), lighten = js.Any.fromFunction2(lighten), map = js.Any.fromFunction2(map), rgb = js.Any.fromFunction1(rgb), scale = js.Any.fromFunction0(scale))
  
    __obj.asInstanceOf[UtilColor]
  }
}

