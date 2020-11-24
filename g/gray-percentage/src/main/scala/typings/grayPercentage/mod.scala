package typings.grayPercentage

import typings.grayPercentage.grayPercentageStrings.cool
import typings.grayPercentage.grayPercentageStrings.slate
import typings.grayPercentage.grayPercentageStrings.warm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gray-percentage", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(lightness: Double): String = js.native
  def apply(lightness: Double, hue: js.UndefOr[scala.Nothing], darkBackground: Boolean): String = js.native
  def apply(lightness: Double, hue: Double): String = js.native
  def apply(lightness: Double, hue: Double, darkBackground: Boolean): String = js.native
  def apply(lightness: Double, hue: cool): String = js.native
  def apply(lightness: Double, hue: cool, darkBackground: Boolean): String = js.native
  def apply(lightness: Double, hue: slate): String = js.native
  def apply(lightness: Double, hue: slate, darkBackground: Boolean): String = js.native
  def apply(lightness: Double, hue: warm): String = js.native
  def apply(lightness: Double, hue: warm, darkBackground: Boolean): String = js.native
}
