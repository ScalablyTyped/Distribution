package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialogUngroupingColumnEventUIParam extends js.Object {
  /**
    * The key of the column to be grouped.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Get a reference to the current layout object, if any.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ModalDialogUngroupingColumnEventUIParam {
  @scala.inline
  def apply(): ModalDialogUngroupingColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogUngroupingColumnEventUIParam]
  }
  @scala.inline
  implicit class ModalDialogUngroupingColumnEventUIParamOps[Self <: ModalDialogUngroupingColumnEventUIParam] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

