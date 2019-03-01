package typings
package jqueryDashStepsLib.JQueryStepsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Settings"
//#region "Label Settings"
trait LabelSettings extends js.Object {
  /**
    * Label for the cancel button. Default value is Cancel.
    */
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This label is important for accessability reasons. Indicates which step is activated. Default value is current step:.
    */
  var current: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the finish button. Default value is Finish.
    */
  var finish: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the loading animation. Default value is Loading ... .
    */
  var loading: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the next button. Default value is Next.
    */
  var next: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This label is important for accessability reasons and describes the kind of navigation. Default value is Pagination.
    */
  var pagination: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the previous button. Default value is Previous.
    */
  var previous: js.UndefOr[java.lang.String] = js.undefined
}

object LabelSettings {
  @scala.inline
  def apply(
    cancel: java.lang.String = null,
    current: java.lang.String = null,
    finish: java.lang.String = null,
    loading: java.lang.String = null,
    next: java.lang.String = null,
    pagination: java.lang.String = null,
    previous: java.lang.String = null
  ): LabelSettings = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (current != null) __obj.updateDynamic("current")(current)
    if (finish != null) __obj.updateDynamic("finish")(finish)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (next != null) __obj.updateDynamic("next")(next)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    __obj.asInstanceOf[LabelSettings]
  }
}

