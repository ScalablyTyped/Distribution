package typings.ink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledFocusIds extends js.Object {
  var activeFocusId: js.UndefOr[scala.Nothing] = js.native
  var disabledFocusIds: js.Array[scala.Nothing] = js.native
  var focusIds: js.Array[scala.Nothing] = js.native
  var isFocusEnabled: Boolean = js.native
}

object DisabledFocusIds {
  @scala.inline
  def apply(
    disabledFocusIds: js.Array[scala.Nothing],
    focusIds: js.Array[scala.Nothing],
    isFocusEnabled: Boolean
  ): DisabledFocusIds = {
    val __obj = js.Dynamic.literal(disabledFocusIds = disabledFocusIds.asInstanceOf[js.Any], focusIds = focusIds.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledFocusIds]
  }
  @scala.inline
  implicit class DisabledFocusIdsOps[Self <: DisabledFocusIds] (val x: Self) extends AnyVal {
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
    def setDisabledFocusIdsVarargs(value: scala.Nothing*): Self = this.set("disabledFocusIds", js.Array(value :_*))
    @scala.inline
    def setDisabledFocusIds(value: js.Array[scala.Nothing]): Self = this.set("disabledFocusIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusIdsVarargs(value: scala.Nothing*): Self = this.set("focusIds", js.Array(value :_*))
    @scala.inline
    def setFocusIds(value: js.Array[scala.Nothing]): Self = this.set("focusIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFocusEnabled(value: Boolean): Self = this.set("isFocusEnabled", value.asInstanceOf[js.Any])
  }
  
}

