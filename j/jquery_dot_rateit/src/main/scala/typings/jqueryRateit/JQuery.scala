package typings.jqueryRateit

import typings.jqueryRateit.jqueryRateitStrings.ispreset
import typings.jqueryRateit.jqueryRateitStrings.max
import typings.jqueryRateit.jqueryRateitStrings.min
import typings.jqueryRateit.jqueryRateitStrings.readonly
import typings.jqueryRateit.jqueryRateitStrings.reset
import typings.jqueryRateit.jqueryRateitStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def rateit(): JQuery = js.native
  def rateit(method: String, param: js.Any): js.Any = js.native
  def rateit(options: RateItOptions): JQuery = js.native
  @JSName("rateit")
  def rateit_ispreset(method: ispreset): Boolean = js.native
  @JSName("rateit")
  def rateit_ispreset(method: ispreset, param: Boolean): JQuery = js.native
  @JSName("rateit")
  def rateit_max(method: max): Double = js.native
  @JSName("rateit")
  def rateit_max(method: max, param: Double): JQuery = js.native
  @JSName("rateit")
  def rateit_min(method: min): Double = js.native
  @JSName("rateit")
  def rateit_min(method: min, param: Double): JQuery = js.native
  @JSName("rateit")
  def rateit_readonly(method: readonly): Boolean = js.native
  @JSName("rateit")
  def rateit_readonly(method: readonly, param: Boolean): JQuery = js.native
  @JSName("rateit")
  def rateit_reset(method: reset): JQuery = js.native
  @JSName("rateit")
  def rateit_value(method: value): Double = js.native
  @JSName("rateit")
  def rateit_value(method: value, param: Double): JQuery = js.native
}
