package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEndedEventUIParam extends js.Object {
  /**
    * Gets the name of the action, which triggered the animation.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Gets the boolean value of the old pin state of the dialog.
    */
  var oldPinned: js.UndefOr[Boolean] = js.native
  /**
    * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
    */
  var oldState: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object AnimationEndedEventUIParam {
  @scala.inline
  def apply(): AnimationEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEndedEventUIParam]
  }
  @scala.inline
  implicit class AnimationEndedEventUIParamOps[Self <: AnimationEndedEventUIParam] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setOldPinned(value: Boolean): Self = this.set("oldPinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldPinned: Self = this.set("oldPinned", js.undefined)
    @scala.inline
    def setOldState(value: String): Self = this.set("oldState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldState: Self = this.set("oldState", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

