package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowEditDialogContentsRenderedEventUIParam extends js.Object {
  /**
    * Gets a reference to row edit dialog DOM element.
    */
  var dialogElement: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object RowEditDialogContentsRenderedEventUIParam {
  @scala.inline
  def apply(): RowEditDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEditDialogContentsRenderedEventUIParam]
  }
  @scala.inline
  implicit class RowEditDialogContentsRenderedEventUIParamOps[Self <: RowEditDialogContentsRenderedEventUIParam] (val x: Self) extends AnyVal {
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
    def setDialogElement(value: js.Any): Self = this.set("dialogElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogElement: Self = this.set("dialogElement", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

