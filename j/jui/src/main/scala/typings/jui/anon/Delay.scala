package typings.jui.anon

import typings.jui.juiStrings.bottom
import typings.jui.juiStrings.center
import typings.jui.juiStrings.left
import typings.jui.juiStrings.right
import typings.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends js.Object {
  /**
    * @cfg {"left"/"right"/"center"} [align="left"]
    * Determines the alignment state inside a tooltip
    */
  var align: js.UndefOr[left | right | center] = js.native
  /**
    * @cfg {String} [color="black"]
    * Determines the color of a tooltip
    */
  var color: js.UndefOr[String] = js.native
  /**
    * @cfg {Integer} [delay=0]
    * Determines the event time when a tooltip is shown
    */
  var delay: js.UndefOr[Double] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {String} [hideType="mouseout"]
    * Determines the type of event that hides a tooltip
    */
  var hideType: js.UndefOr[String] = js.native
  /**
    * @cfg {"top"/"bottom"/"left"/"right"} [position="top"]
    * Determines the location where a tooltip is shown
    */
  var position: js.UndefOr[top | bottom | left | right] = js.native
  /**
    * @cfg {String} [showType="mouseover"]
    * Determines the type of event that triggers a tooltip
    */
  var showType: js.UndefOr[String] = js.native
  /**
    * @cfg {String} [title=""]
    * Sets the content of a tooltip (referring to the title properties in markup)
    */
  var title: js.UndefOr[String] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [width=150]
    * Determines the horizontal size of a tooltip
    */
  var width: js.UndefOr[Double] = js.native
}

object Delay {
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  @scala.inline
  implicit class DelayOps[Self <: Delay] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right | center): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setHideType(value: String): Self = this.set("hideType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideType: Self = this.set("hideType", js.undefined)
    @scala.inline
    def setPosition(value: top | bottom | left | right): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowType(value: String): Self = this.set("showType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowType: Self = this.set("showType", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

