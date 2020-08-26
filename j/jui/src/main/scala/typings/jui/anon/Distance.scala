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

@js.native
trait Distance extends js.Object {
  /**
    * @cfg {Integer} [distance=5]
    * Determines each margin value when there are multiple notice messages
    */
  var distance: js.UndefOr[Double] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [hideDuration=500]
    * Determines the duration of an effect when a notice message disappears
    */
  var hideDuration: js.UndefOr[Double] = js.native
  /**
    * @cfg {String} [hideEasing="linear"]
    * Determines an effect when a notice message disappears (see CSS3 specifications)
    */
  var hideEasing: js.UndefOr[String] = js.native
  /**
    * @cfg {Integer} [padding=12]
    * Determines the margin value of a notice message (the margin value may be in object form rather than a numeric value)
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * @cfg {"top"/"top-lefet"/"top-right"/"bottom"/"bottom-left"/"bottom-right"} [position="top-right"]
    * Designates the location where a notice message is added
    */
  var position: js.UndefOr[top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`] = js.native
  /**
    * @cfg {Integer} [showDuration=500]
    * Determines the duration of an effect when a notice message is shown
    */
  var showDuration: js.UndefOr[Double] = js.native
  /**
    * @cfg {String} [showEasing="swing"]
    * Determines an effect when a notice message is shown (see CSS3 specifications)
    */
  var showEasing: js.UndefOr[String] = js.native
  /**
    * @cfg {Integer} [timeout=3000]
    * Determines the duration for which a notice message is displayed (the message does not disappear when the value is 0)
    */
  var timeout: js.UndefOr[Double] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object Distance {
  @scala.inline
  def apply(): Distance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setHideDuration(value: Double): Self = this.set("hideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDuration: Self = this.set("hideDuration", js.undefined)
    @scala.inline
    def setHideEasing(value: String): Self = this.set("hideEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEasing: Self = this.set("hideEasing", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPosition(value: top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowDuration(value: Double): Self = this.set("showDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDuration: Self = this.set("showDuration", js.undefined)
    @scala.inline
    def setShowEasing(value: String): Self = this.set("showEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEasing: Self = this.set("showEasing", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
  }
  
}

