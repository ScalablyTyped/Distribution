package typings.jqueryStickem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickemSettings extends js.Object {
  /**
    * selector for content container, sizes matched with `item`
    */
  var container: js.UndefOr[String] = js.native
  /**
    * css class used to apply when ending sticky
    */
  var endStickClass: js.UndefOr[String] = js.native
  /**
    * selector for element to make sticky
    */
  var item: js.UndefOr[String] = js.native
  /**
    * offset to use for the sticky element in the parent element
    */
  var offset: js.UndefOr[Double | String] = js.native
  /**
    * Callback to execute when in stick state
    */
  var onStick: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback to execute when getting out of stick state
    */
  var onUnstick: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * where to place sticky element
    */
  var start: js.UndefOr[Double | String] = js.native
  /**
    * css class used to apply
    */
  var stickClass: js.UndefOr[String] = js.native
}

object StickemSettings {
  @scala.inline
  def apply(): StickemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickemSettings]
  }
  @scala.inline
  implicit class StickemSettingsOps[Self <: StickemSettings] (val x: Self) extends AnyVal {
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setEndStickClass(value: String): Self = this.set("endStickClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndStickClass: Self = this.set("endStickClass", js.undefined)
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnStick(value: () => Unit): Self = this.set("onStick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStick: Self = this.set("onStick", js.undefined)
    @scala.inline
    def setOnUnstick(value: () => Unit): Self = this.set("onUnstick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnUnstick: Self = this.set("onUnstick", js.undefined)
    @scala.inline
    def setStart(value: Double | String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStickClass(value: String): Self = this.set("stickClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickClass: Self = this.set("stickClass", js.undefined)
  }
  
}

