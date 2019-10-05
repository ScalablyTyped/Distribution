package typings.jqueryDashMaskmoney

import typings.jqueryDashMaskmoney.jQueryMaskMoney.Options
import typings.jqueryDashMaskmoney.jqueryDashMaskmoneyStrings.destroy
import typings.jqueryDashMaskmoney.jqueryDashMaskmoneyStrings.mask
import typings.jqueryDashMaskmoney.jqueryDashMaskmoneyStrings.unmasked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Returns a float value from input field masked
    */
  def maskMoney(): js.Array[Double] = js.native
  def maskMoney(methodOrOption: Options): JQuery = js.native
  /**
    * Apply mask to input when the argument are options
    * Remove maskMoney from an element when the argument is "destroy"
    */
  @JSName("maskMoney")
  def maskMoney_JQuery(): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_destroy(methodOrOption: destroy): JQuery = js.native
  /**
    * Apply mask to input, can be pass default value to it
    */
  @JSName("maskMoney")
  def maskMoney_mask(methodName: mask): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_mask(methodName: mask, defaultValue: Double): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_unmasked(method: unmasked): js.Array[Double] = js.native
}

