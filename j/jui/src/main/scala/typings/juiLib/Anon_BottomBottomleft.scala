package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomBottomleft extends js.Object {
  /**
    * @cfg {Integer} [distance=5]
    * Determines each margin value when there are multiple notice messages
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [hideDuration=500]
    * Determines the duration of an effect when a notice message disappears
    */
  var hideDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {String} [hideEasing="linear"]
    * Determines an effect when a notice message disappears (see CSS3 specifications)
    */
  var hideEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {Integer} [padding=12]
    * Determines the margin value of a notice message (the margin value may be in object form rather than a numeric value)
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {"top"/"top-lefet"/"top-right"/"bottom"/"bottom-left"/"bottom-right"} [position="top-right"]
    * Designates the location where a notice message is added
    */
  var position: js.UndefOr[
    juiLib.juiLibStrings.top | juiLib.juiLibStrings.`top-lefet` | juiLib.juiLibStrings.`top-right` | juiLib.juiLibStrings.bottom | juiLib.juiLibStrings.`bottom-left` | juiLib.juiLibStrings.`bottom-right`
  ] = js.undefined
  /**
    * @cfg {Integer} [showDuration=500]
    * Determines the duration of an effect when a notice message is shown
    */
  var showDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {String} [showEasing="swing"]
    * Determines an effect when a notice message is shown (see CSS3 specifications)
    */
  var showEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {Integer} [timeout=3000]
    * Determines the duration for which a notice message is displayed (the message does not disappear when the value is 0)
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Anon_BottomBottomleft {
  @scala.inline
  def apply(
    distance: scala.Int | scala.Double = null,
    event: js.Any = null,
    hideDuration: scala.Int | scala.Double = null,
    hideEasing: java.lang.String = null,
    padding: scala.Int | scala.Double = null,
    position: juiLib.juiLibStrings.top | juiLib.juiLibStrings.`top-lefet` | juiLib.juiLibStrings.`top-right` | juiLib.juiLibStrings.bottom | juiLib.juiLibStrings.`bottom-left` | juiLib.juiLibStrings.`bottom-right` = null,
    showDuration: scala.Int | scala.Double = null,
    showEasing: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    tpl: js.Any = null
  ): Anon_BottomBottomleft = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (hideDuration != null) __obj.updateDynamic("hideDuration")(hideDuration.asInstanceOf[js.Any])
    if (hideEasing != null) __obj.updateDynamic("hideEasing")(hideEasing)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showDuration != null) __obj.updateDynamic("showDuration")(showDuration.asInstanceOf[js.Any])
    if (showEasing != null) __obj.updateDynamic("showEasing")(showEasing)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[Anon_BottomBottomleft]
  }
}

