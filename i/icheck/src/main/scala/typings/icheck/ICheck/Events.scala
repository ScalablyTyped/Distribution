package typings.icheck.ICheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /**
    * input's "checked", "disabled" or "indeterminate" state is changed
    */
  def ifChanged(): Unit = js.native
  /**
    * input's state is changed to "checked"
    */
  def ifChecked(): Unit = js.native
  /**
    * user clicked on a customized input or an assigned label
    */
  def ifClicked(): Unit = js.native
  /**
    * input is just customized
    */
  def ifCreated(): Unit = js.native
  /**
    * customization is just removed
    */
  def ifDestroyed(): Unit = js.native
  /**
    * "indeterminate" state is removed
    */
  def ifDeterminate(): Unit = js.native
  /**
    * input's state is changed to "disabled"
    */
  def ifDisabled(): Unit = js.native
  /**
    * "disabled" state is removed
    */
  def ifEnabled(): Unit = js.native
  /**
    * input's state is changed to "indeterminate"
    */
  def ifIndeterminate(): Unit = js.native
  /**
    * input's "checked" state is changed
    */
  def ifToggled(): Unit = js.native
  /**
    * "checked" state is removed
    */
  def ifUnchecked(): Unit = js.native
}

object Events {
  @scala.inline
  def apply(
    ifChanged: () => Unit,
    ifChecked: () => Unit,
    ifClicked: () => Unit,
    ifCreated: () => Unit,
    ifDestroyed: () => Unit,
    ifDeterminate: () => Unit,
    ifDisabled: () => Unit,
    ifEnabled: () => Unit,
    ifIndeterminate: () => Unit,
    ifToggled: () => Unit,
    ifUnchecked: () => Unit
  ): Events = {
    val __obj = js.Dynamic.literal(ifChanged = js.Any.fromFunction0(ifChanged), ifChecked = js.Any.fromFunction0(ifChecked), ifClicked = js.Any.fromFunction0(ifClicked), ifCreated = js.Any.fromFunction0(ifCreated), ifDestroyed = js.Any.fromFunction0(ifDestroyed), ifDeterminate = js.Any.fromFunction0(ifDeterminate), ifDisabled = js.Any.fromFunction0(ifDisabled), ifEnabled = js.Any.fromFunction0(ifEnabled), ifIndeterminate = js.Any.fromFunction0(ifIndeterminate), ifToggled = js.Any.fromFunction0(ifToggled), ifUnchecked = js.Any.fromFunction0(ifUnchecked))
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
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
    def setIfChanged(value: () => Unit): Self = this.set("ifChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setIfChecked(value: () => Unit): Self = this.set("ifChecked", js.Any.fromFunction0(value))
    @scala.inline
    def setIfClicked(value: () => Unit): Self = this.set("ifClicked", js.Any.fromFunction0(value))
    @scala.inline
    def setIfCreated(value: () => Unit): Self = this.set("ifCreated", js.Any.fromFunction0(value))
    @scala.inline
    def setIfDestroyed(value: () => Unit): Self = this.set("ifDestroyed", js.Any.fromFunction0(value))
    @scala.inline
    def setIfDeterminate(value: () => Unit): Self = this.set("ifDeterminate", js.Any.fromFunction0(value))
    @scala.inline
    def setIfDisabled(value: () => Unit): Self = this.set("ifDisabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIfEnabled(value: () => Unit): Self = this.set("ifEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIfIndeterminate(value: () => Unit): Self = this.set("ifIndeterminate", js.Any.fromFunction0(value))
    @scala.inline
    def setIfToggled(value: () => Unit): Self = this.set("ifToggled", js.Any.fromFunction0(value))
    @scala.inline
    def setIfUnchecked(value: () => Unit): Self = this.set("ifUnchecked", js.Any.fromFunction0(value))
  }
  
}

