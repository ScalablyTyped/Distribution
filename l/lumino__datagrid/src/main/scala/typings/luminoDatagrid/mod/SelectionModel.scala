package typings.luminoDatagrid.mod

import typings.luminoDatagrid.selectionmodelMod.SelectionModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid", "SelectionModel")
@js.native
abstract class SelectionModel protected ()
  extends typings.luminoDatagrid.selectionmodelMod.SelectionModel {
  /**
    * Construct a new selection model.
    *
    * @param options - The options for initializing the model.
    */
  def this(options: IOptions) = this()
}

