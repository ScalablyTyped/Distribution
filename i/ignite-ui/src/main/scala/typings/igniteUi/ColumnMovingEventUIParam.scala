package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMovingEventUIParam extends js.Object {
  /**
    * Gets the column index of the column that was being moved.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Gets the column key of the column that was being moved.
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[String] = js.native
  /**
    * Gets the new column index of the column that was being moved.
    */
  var targetIndex: js.UndefOr[Double] = js.native
}

object ColumnMovingEventUIParam {
  @scala.inline
  def apply(): ColumnMovingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMovingEventUIParam]
  }
  @scala.inline
  implicit class ColumnMovingEventUIParamOps[Self <: ColumnMovingEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setTargetIndex(value: Double): Self = this.set("targetIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetIndex: Self = this.set("targetIndex", js.undefined)
  }
  
}

