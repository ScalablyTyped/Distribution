package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock) A `closePopup` event. Fired when Popup should be
    * hidden, for example when clicking on an annotation again.
    */
  var closePopup: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock) Event fired when button state should change, for
    * example after adding an annotation.
    */
  var deselectButton: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock) Event fired on a button click.
    */
  var selectButton: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock) A `showPopup` event. Fired when selecting for
    * example an annotation.
    */
  var showPopup: js.UndefOr[js.Function] = js.undefined
}

object NavigationEventsOptions {
  @scala.inline
  def apply(
    closePopup: js.Function = null,
    deselectButton: js.Function = null,
    selectButton: js.Function = null,
    showPopup: js.Function = null
  ): NavigationEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (closePopup != null) __obj.updateDynamic("closePopup")(closePopup.asInstanceOf[js.Any])
    if (deselectButton != null) __obj.updateDynamic("deselectButton")(deselectButton.asInstanceOf[js.Any])
    if (selectButton != null) __obj.updateDynamic("selectButton")(selectButton.asInstanceOf[js.Any])
    if (showPopup != null) __obj.updateDynamic("showPopup")(showPopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEventsOptions]
  }
}

