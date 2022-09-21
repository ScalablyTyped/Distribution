package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "Color")
@js.native
open class Color_ protected () extends StObject {
  /**
    * Handle color operations. Some object methods are chainable.
    *
    * @param input
    *        The input color in either rbga or hex format
    */
  def this(input: ColorType) = this()
  
  /**
    * Brighten the color instance.
    *
    * @param alpha
    *        The alpha value.
    *
    * @return This color with modifications.
    */
  def brighten(alpha: Double): Color_ = js.native
  
  /**
    * Return the color or gradient stops in the specified format
    *
    * @param format
    *        Possible values are 'a', 'rgb', 'rgba' (default).
    *
    * @return This color as a string or gradient stops.
    */
  def get(): ColorType = js.native
  def get(format: String): ColorType = js.native
  
  /**
    * Set the color's opacity to a given alpha value.
    *
    * @param alpha
    *        Opacity between 0 and 1.
    *
    * @return Color with modifications.
    */
  def setOpacity(alpha: Double): Color_ = js.native
  
  /**
    * Return an intermediate color between two colors.
    *
    * @param to
    *        The color object to tween to.
    *
    * @param pos
    *        The intermediate position, where 0 is the from color (current
    *        color item), and 1 is the `to` color.
    *
    * @return The intermediate color in rgba notation, or unsupported type.
    */
  def tweenTo(to: Color_, pos: Double): ColorType = js.native
}
/* static members */
object Color_ {
  
  @JSImport("highcharts", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a color instance out of a color string or object.
    *
    * @param input
    *        The input color in either rbga or hex format.
    *
    * @return Color instance.
    */
  inline def parse(): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Color_]
  inline def parse(input: ColorType): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Color_]
}
