package typings.jqueryTypeahead.RunningCoder.Typeahead

import typings.jquery.JQueryEventObject
import typings.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectSettingsCallback extends js.Object {
  /** Triggered when a multiselect item is canceled */
  var onCancel: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
  /** Triggered when a multiselect item is clicked */
  var onClick: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.undefined
}

object MultiSelectSettingsCallback {
  @scala.inline
  def apply(
    onCancel: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit = null,
    onClick: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit = null
  ): MultiSelectSettingsCallback = {
    val __obj = js.Dynamic.literal()
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction3(onCancel))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[MultiSelectSettingsCallback]
  }
}

