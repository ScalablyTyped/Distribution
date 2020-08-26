package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnShowingEventUIParam extends js.Object {
  /**
    * Gets the shown column index.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Gets the shown column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ColumnShowingEventUIParam {
  @scala.inline
  def apply(): ColumnShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnShowingEventUIParam]
  }
  @scala.inline
  implicit class ColumnShowingEventUIParamOps[Self <: ColumnShowingEventUIParam] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

