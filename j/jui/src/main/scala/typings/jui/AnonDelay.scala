package typings.jui

import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.center
import typings.jui.juiStrings.left
import typings.jui.juiStrings.right
import typings.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends js.Object {
  /**
    * @cfg {"left"/"right"/"center"} [align="left"]
    * Determines the alignment state inside a tooltip
    */
  var align: js.UndefOr[left | right | center] = js.undefined
  /**
    * @cfg {String} [color="black"]
    * Determines the color of a tooltip
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Integer} [delay=0]
    * Determines the event time when a tooltip is shown
    */
  var delay: js.UndefOr[Double] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {String} [hideType="mouseout"]
    * Determines the type of event that hides a tooltip
    */
  var hideType: js.UndefOr[String] = js.undefined
  /**
    * @cfg {"top"/"bottom"/"left"/"right"} [position="top"]
    * Determines the location where a tooltip is shown
    */
  var position: js.UndefOr[top | bottom | left | right] = js.undefined
  /**
    * @cfg {String} [showType="mouseover"]
    * Determines the type of event that triggers a tooltip
    */
  var showType: js.UndefOr[String] = js.undefined
  /**
    * @cfg {String} [title=""]
    * Sets the content of a tooltip (referring to the title properties in markup)
    */
  var title: js.UndefOr[String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [width=150]
    * Determines the horizontal size of a tooltip
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonDelay {
  @scala.inline
  def apply(
    align: left | right | center = null,
    color: String = null,
    delay: Int | Double = null,
    event: js.Any = null,
    hideType: String = null,
    position: top | bottom | left | right = null,
    showType: String = null,
    title: String = null,
    tpl: js.Any = null,
    width: Int | Double = null
  ): AnonDelay = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (hideType != null) __obj.updateDynamic("hideType")(hideType.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showType != null) __obj.updateDynamic("showType")(showType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}

