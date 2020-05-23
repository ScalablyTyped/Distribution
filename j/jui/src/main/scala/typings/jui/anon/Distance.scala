package typings.jui.anon

import typings.jui.juiStrings.`bottom-left`
import typings.jui.juiStrings.`bottom-right`
import typings.jui.juiStrings.`top-lefet`
import typings.jui.juiStrings.`top-right`
import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  /**
    * @cfg {Integer} [distance=5]
    * Determines each margin value when there are multiple notice messages
    */
  var distance: js.UndefOr[Double] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [hideDuration=500]
    * Determines the duration of an effect when a notice message disappears
    */
  var hideDuration: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {String} [hideEasing="linear"]
    * Determines an effect when a notice message disappears (see CSS3 specifications)
    */
  var hideEasing: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Integer} [padding=12]
    * Determines the margin value of a notice message (the margin value may be in object form rather than a numeric value)
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {"top"/"top-lefet"/"top-right"/"bottom"/"bottom-left"/"bottom-right"} [position="top-right"]
    * Designates the location where a notice message is added
    */
  var position: js.UndefOr[top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`] = js.undefined
  /**
    * @cfg {Integer} [showDuration=500]
    * Determines the duration of an effect when a notice message is shown
    */
  var showDuration: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {String} [showEasing="swing"]
    * Determines an effect when a notice message is shown (see CSS3 specifications)
    */
  var showEasing: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Integer} [timeout=3000]
    * Determines the duration for which a notice message is displayed (the message does not disappear when the value is 0)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Distance {
  @scala.inline
  def apply(
    distance: js.UndefOr[Double] = js.undefined,
    event: js.Any = null,
    hideDuration: js.UndefOr[Double] = js.undefined,
    hideEasing: String = null,
    padding: js.UndefOr[Double] = js.undefined,
    position: top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right` = null,
    showDuration: js.UndefOr[Double] = js.undefined,
    showEasing: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    tpl: js.Any = null
  ): Distance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDuration)) __obj.updateDynamic("hideDuration")(hideDuration.get.asInstanceOf[js.Any])
    if (hideEasing != null) __obj.updateDynamic("hideEasing")(hideEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showDuration)) __obj.updateDynamic("showDuration")(showDuration.get.asInstanceOf[js.Any])
    if (showEasing != null) __obj.updateDynamic("showEasing")(showEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
}

