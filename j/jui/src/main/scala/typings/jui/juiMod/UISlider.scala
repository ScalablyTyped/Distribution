package typings.jui.juiMod

import typings.jui.Anon_Double
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISlider extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Anon_Double): this.type = js.native
  /**
    * get FromHandle's value
    *
    * @return value
    */
  def getFromValue(): Double = js.native
  /**
    * get ToHandle's value
    *
    * @return value
    */
  def getToValue(): Double = js.native
  /**
    * set FromHandle's value
    */
  def setFromValue(value: Double): Unit = js.native
  /**
    * set ToHandle's value
    */
  def setToValue(value: Double): Unit = js.native
}

