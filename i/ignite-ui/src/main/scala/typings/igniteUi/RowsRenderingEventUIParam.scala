package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowsRenderingEventUIParam extends js.Object {
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to the grid's table body.
    */
  var tbody: js.UndefOr[Element] = js.native
}

object RowsRenderingEventUIParam {
  @scala.inline
  def apply(): RowsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRenderingEventUIParam]
  }
  @scala.inline
  implicit class RowsRenderingEventUIParamOps[Self <: RowsRenderingEventUIParam] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTbody(value: Element): Self = this.set("tbody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTbody: Self = this.set("tbody", js.undefined)
  }
  
}

