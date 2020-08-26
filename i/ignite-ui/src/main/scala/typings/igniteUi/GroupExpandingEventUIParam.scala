package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupExpandingEventUIParam extends js.Object {
  /**
    * Gets the column object for the current group that is expanding.
    */
  var column: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the jQuery object for the column being expanded (th).
    */
  var element: js.UndefOr[String] = js.native
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object GroupExpandingEventUIParam {
  @scala.inline
  def apply(): GroupExpandingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupExpandingEventUIParam]
  }
  @scala.inline
  implicit class GroupExpandingEventUIParamOps[Self <: GroupExpandingEventUIParam] (val x: Self) extends AnyVal {
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
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

