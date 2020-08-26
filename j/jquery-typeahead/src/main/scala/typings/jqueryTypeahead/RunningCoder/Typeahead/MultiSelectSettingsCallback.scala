package typings.jqueryTypeahead.RunningCoder.Typeahead

import typings.jquery.JQueryEventObject
import typings.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectSettingsCallback extends js.Object {
  /** Triggered when a multiselect item is canceled */
  var onCancel: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Triggered when a multiselect item is clicked */
  var onClick: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
}

object MultiSelectSettingsCallback {
  @scala.inline
  def apply(): MultiSelectSettingsCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectSettingsCallback]
  }
  @scala.inline
  implicit class MultiSelectSettingsCallbackOps[Self <: MultiSelectSettingsCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnCancel(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onCancel", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

