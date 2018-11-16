package typings
package jqueryDashEditableDashSelectLib.JQueryEditableSelectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditableSelectOptions extends js.Object {
  /**
           * Where to append the dropdown list in the DOM.
           */
  var appendTo: js.UndefOr[java.lang.String | jqueryDashEditableDashSelectLib.JQuery] = js.undefined
  /**
           * Duration of the easings (in milliseconds).
           */
  var duration: js.UndefOr[
    scala.Double | jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.fast | jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.slow
  ] = js.undefined
  /**
           * Easing used for showing and hiding the dropdown list.
           */
  var effects: js.UndefOr[
    jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.default | jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.slide | jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.fade
  ] = js.undefined
  /**
           * Filter (or not) items in list while typing.
           */
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * How dropdown list is triggered.
           */
  var trigger: js.UndefOr[
    jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.focus | jqueryDashEditableDashSelectLib.jqueryDashEditableDashSelectLibStrings.manual
  ] = js.undefined
}

