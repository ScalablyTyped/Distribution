package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO What is the most appropriate place for these interfaces?
// They are only required by the `jo` class.
@js.native
trait ISettings extends js.Object {
  def isSet(): Boolean = js.native
  def reset(): Unit = js.native
}

object ISettings {
  @scala.inline
  def apply(isSet: () => Boolean, reset: () => Unit): ISettings = {
    val __obj = js.Dynamic.literal(isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ISettings]
  }
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
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
    def setIsSet(value: () => Boolean): Self = this.set("isSet", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

