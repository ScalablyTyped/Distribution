package typings
package jqueryDashMaskmoneyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Returns a float value from input field masked
    */
  def maskMoney(): js.Array[scala.Double] = js.native
  def maskMoney(methodOrOption: jqueryDashMaskmoneyLib.jQueryMaskMoneyNs.Options): JQuery = js.native
  /**
    * Apply mask to input when the argument are options
    * Remove maskMoney from an element when the argument is "destroy"
    */
  @JSName("maskMoney")
  def maskMoney_JQuery(): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_destroy(methodOrOption: jqueryDashMaskmoneyLib.jqueryDashMaskmoneyLibStrings.destroy): JQuery = js.native
  /**
    * Apply mask to input, can be pass default value to it
    */
  @JSName("maskMoney")
  def maskMoney_mask(methodName: jqueryDashMaskmoneyLib.jqueryDashMaskmoneyLibStrings.mask): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_mask(methodName: jqueryDashMaskmoneyLib.jqueryDashMaskmoneyLibStrings.mask, defaultValue: scala.Double): JQuery = js.native
  @JSName("maskMoney")
  def maskMoney_unmasked(method: jqueryDashMaskmoneyLib.jqueryDashMaskmoneyLibStrings.unmasked): js.Array[scala.Double] = js.native
}

