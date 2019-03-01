package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignBottom extends js.Object {
  /**
    * @cfg {"left"/"right"/"center"} [align="left"]
    * Determines the alignment state inside a tooltip
    */
  var align: js.UndefOr[
    juiLib.juiLibStrings.left | juiLib.juiLibStrings.right | juiLib.juiLibStrings.center
  ] = js.undefined
  /**
    * @cfg {String} [color="black"]
    * Determines the color of a tooltip
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {Integer} [delay=0]
    * Determines the event time when a tooltip is shown
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String} [hideType="mouseout"]
    * Determines the type of event that hides a tooltip
    */
  var hideType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {"top"/"bottom"/"left"/"right"} [position="top"]
    * Determines the location where a tooltip is shown
    */
  var position: js.UndefOr[
    juiLib.juiLibStrings.top | juiLib.juiLibStrings.bottom | juiLib.juiLibStrings.left | juiLib.juiLibStrings.right
  ] = js.undefined
  /**
    * @cfg {String} [showType="mouseover"]
    * Determines the type of event that triggers a tooltip
    */
  var showType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @cfg {String} [title=""]
    * Sets the content of a tooltip (referring to the title properties in markup)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [width=150]
    * Determines the horizontal size of a tooltip
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AlignBottom {
  @scala.inline
  def apply(
    align: juiLib.juiLibStrings.left | juiLib.juiLibStrings.right | juiLib.juiLibStrings.center = null,
    color: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    event: js.Any = null,
    hideType: java.lang.String = null,
    position: juiLib.juiLibStrings.top | juiLib.juiLibStrings.bottom | juiLib.juiLibStrings.left | juiLib.juiLibStrings.right = null,
    showType: java.lang.String = null,
    title: java.lang.String = null,
    tpl: js.Any = null,
    width: scala.Int | scala.Double = null
  ): Anon_AlignBottom = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (hideType != null) __obj.updateDynamic("hideType")(hideType)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showType != null) __obj.updateDynamic("showType")(showType)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignBottom]
  }
}

