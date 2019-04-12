package typings
package jqueryDashTypeaheadLib.RunningCoderNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectSettingsCallback extends js.Object {
  /** Triggered when a multiselect item is canceled */
  var onCancel: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[jqueryLib.JQueryEventObject], 
      scala.Unit
    ]
  ] = js.undefined
  /** Triggered when a multiselect item is clicked */
  var onClick: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[jqueryLib.JQueryEventObject], 
      scala.Unit
    ]
  ] = js.undefined
}

object MultiSelectSettingsCallback {
  @scala.inline
  def apply(
    onCancel: (/* node */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[jqueryLib.JQueryEventObject]) => scala.Unit = null,
    onClick: (/* node */ js.UndefOr[jqueryDashTypeaheadLib.JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[jqueryLib.JQueryEventObject]) => scala.Unit = null
  ): MultiSelectSettingsCallback = {
    val __obj = js.Dynamic.literal()
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction3(onCancel))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[MultiSelectSettingsCallback]
  }
}

