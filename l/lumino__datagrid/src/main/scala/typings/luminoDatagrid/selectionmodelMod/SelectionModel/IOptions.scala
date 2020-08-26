package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import typings.luminoDatagrid.datamodelMod.DataModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a selection model.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The data model for the selection model.
    */
  var dataModel: DataModel = js.native
  /**
    * The selection mode for the model.
    *
    * The default is `'cell'`.
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
}

object IOptions {
  @scala.inline
  def apply(dataModel: DataModel): IOptions = {
    val __obj = js.Dynamic.literal(dataModel = dataModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setDataModel(value: DataModel): Self = this.set("dataModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
  }
  
}

