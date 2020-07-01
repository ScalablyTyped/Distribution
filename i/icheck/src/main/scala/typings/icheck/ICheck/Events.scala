package typings.icheck.ICheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  /**
    * input's "checked", "disabled" or "indeterminate" state is changed
    */
  def ifChanged(): Unit
  /**
    * input's state is changed to "checked"
    */
  def ifChecked(): Unit
  /**
    * user clicked on a customized input or an assigned label
    */
  def ifClicked(): Unit
  /**
    * input is just customized
    */
  def ifCreated(): Unit
  /**
    * customization is just removed
    */
  def ifDestroyed(): Unit
  /**
    * "indeterminate" state is removed
    */
  def ifDeterminate(): Unit
  /**
    * input's state is changed to "disabled"
    */
  def ifDisabled(): Unit
  /**
    * "disabled" state is removed
    */
  def ifEnabled(): Unit
  /**
    * input's state is changed to "indeterminate"
    */
  def ifIndeterminate(): Unit
  /**
    * input's "checked" state is changed
    */
  def ifToggled(): Unit
  /**
    * "checked" state is removed
    */
  def ifUnchecked(): Unit
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
}

