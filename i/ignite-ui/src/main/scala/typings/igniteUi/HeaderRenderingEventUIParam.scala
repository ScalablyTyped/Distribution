package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderRenderingEventUIParam extends js.Object {
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object HeaderRenderingEventUIParam {
  @scala.inline
  def apply(): HeaderRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderRenderingEventUIParam]
  }
  @scala.inline
  implicit class HeaderRenderingEventUIParamOps[Self <: HeaderRenderingEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

