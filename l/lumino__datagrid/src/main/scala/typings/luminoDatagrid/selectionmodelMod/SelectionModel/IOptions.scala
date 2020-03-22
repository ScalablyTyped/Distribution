package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import typings.luminoDatagrid.datamodelMod.DataModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a selection model.
  */
trait IOptions extends js.Object {
  /**
    * The data model for the selection model.
    */
  var dataModel: DataModel
  /**
    * The selection mode for the model.
    *
    * The default is `'cell'`.
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(dataModel: DataModel, selectionMode: SelectionMode = null): IOptions = {
    val __obj = js.Dynamic.literal(dataModel = dataModel.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

