package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditCellStartingEventUIParam extends js.Object {
  /**
    * Gets the index of the column.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Gets the key of the column.
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the editor used for editing the column.
    */
  var editor: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Checks if the edit mode is for adding a new row.
    */
  var rowAdding: js.UndefOr[Boolean] = js.native
  /**
    * Gets the row's PK value.
    */
  var rowID: js.UndefOr[js.Any] = js.native
  /**
    * Gets or set the value of the editor.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object EditCellStartingEventUIParam {
  @scala.inline
  def apply(): EditCellStartingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditCellStartingEventUIParam]
  }
  @scala.inline
  implicit class EditCellStartingEventUIParamOps[Self <: EditCellStartingEventUIParam] (val x: Self) extends AnyVal {
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
    def setEditor(value: js.Any): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRowAdding(value: Boolean): Self = this.set("rowAdding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowAdding: Self = this.set("rowAdding", js.undefined)
    @scala.inline
    def setRowID(value: js.Any): Self = this.set("rowID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowID: Self = this.set("rowID", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

