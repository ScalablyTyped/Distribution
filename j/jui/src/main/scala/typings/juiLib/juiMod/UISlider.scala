package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISlider extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_Double): this.type = js.native
  /**
    * get FromHandle's value
    *
    * @return value
    */
  def getFromValue(): scala.Double = js.native
  /**
    * get ToHandle's value
    *
    * @return value
    */
  def getToValue(): scala.Double = js.native
  /**
    * set FromHandle's value
    */
  def setFromValue(value: scala.Double): scala.Unit = js.native
  /**
    * set ToHandle's value
    */
  def setToValue(value: scala.Double): scala.Unit = js.native
}

