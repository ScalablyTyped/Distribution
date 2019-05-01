package typings
package linearDashGradientLib.linearDashGradientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("linear-gradient", JSImport.Namespace)
@js.native
class ^ protected () extends Gradient {
  def this(colors: js.Array[Color]) = this()
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  /* CompleteClass */
  override def calcArray(normalizedPercent: scala.Double): Color = js.native
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  /* CompleteClass */
  override def calcHex(normalizedPrecent: scala.Double): java.lang.String = js.native
}

