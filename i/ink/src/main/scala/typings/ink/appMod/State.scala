package typings.ink.appMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  val activeFocusId: js.UndefOr[String] = js.native
  val error: js.UndefOr[Error] = js.native
  val focusables: js.Array[Focusable] = js.native
  val isFocusEnabled: Boolean = js.native
}

object State {
  @scala.inline
  def apply(focusables: js.Array[Focusable], isFocusEnabled: Boolean): State = {
    val __obj = js.Dynamic.literal(focusables = focusables.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setFocusablesVarargs(value: Focusable*): Self = this.set("focusables", js.Array(value :_*))
    @scala.inline
    def setFocusables(value: js.Array[Focusable]): Self = this.set("focusables", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocusEnabled(value: Boolean): Self = this.set("isFocusEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveFocusId(value: String): Self = this.set("activeFocusId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveFocusId: Self = this.set("activeFocusId", js.undefined)
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

