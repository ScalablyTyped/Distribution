package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewChangingEventUIParam extends js.Object {
  /**
    * Gets a reference to the currently selected view.
    */
  var currentSelectedView: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the newly selected view.
    */
  var newSelectedView: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the scheduler.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ViewChangingEventUIParam {
  @scala.inline
  def apply(): ViewChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewChangingEventUIParam]
  }
  @scala.inline
  implicit class ViewChangingEventUIParamOps[Self <: ViewChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def setCurrentSelectedView(value: String): Self = this.set("currentSelectedView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSelectedView: Self = this.set("currentSelectedView", js.undefined)
    @scala.inline
    def setNewSelectedView(value: String): Self = this.set("newSelectedView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewSelectedView: Self = this.set("newSelectedView", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

