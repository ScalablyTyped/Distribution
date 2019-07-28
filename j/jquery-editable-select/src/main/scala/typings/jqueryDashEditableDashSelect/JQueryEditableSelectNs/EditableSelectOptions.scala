package typings.jqueryDashEditableDashSelect.JQueryEditableSelectNs

import typings.jqueryDashEditableDashSelect.JQuery
import typings.jqueryDashEditableDashSelect.jqueryDashEditableDashSelectStrings.default
import typings.jqueryDashEditableDashSelect.jqueryDashEditableDashSelectStrings.fade
import typings.jqueryDashEditableDashSelect.jqueryDashEditableDashSelectStrings.fast
import typings.jqueryDashEditableDashSelect.jqueryDashEditableDashSelectStrings.focus
import typings.jqueryDashEditableDashSelect.jqueryDashEditableDashSelectStrings.manual
import typings.jqueryDashEditableDashSelect.jqueryDashEditableDashSelectStrings.slide
import typings.jqueryDashEditableDashSelect.jqueryDashEditableDashSelectStrings.slow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableSelectOptions extends js.Object {
  /**
    * Where to append the dropdown list in the DOM.
    */
  var appendTo: js.UndefOr[String | JQuery] = js.undefined
  /**
    * Duration of the easings (in milliseconds).
    */
  var duration: js.UndefOr[Double | fast | slow] = js.undefined
  /**
    * Easing used for showing and hiding the dropdown list.
    */
  var effects: js.UndefOr[default | slide | fade] = js.undefined
  /**
    * Filter (or not) items in list while typing.
    */
  var filter: js.UndefOr[Boolean] = js.undefined
  /**
    * How dropdown list is triggered.
    */
  var trigger: js.UndefOr[focus | manual] = js.undefined
}

object EditableSelectOptions {
  @scala.inline
  def apply(
    appendTo: String | JQuery = null,
    duration: Double | fast | slow = null,
    effects: default | slide | fade = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    trigger: focus | manual = null
  ): EditableSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableSelectOptions]
  }
}

