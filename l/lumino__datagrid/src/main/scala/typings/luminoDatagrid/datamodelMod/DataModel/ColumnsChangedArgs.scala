package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`columns-inserted`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when columns are inserted or removed.
  */
trait ColumnsChangedArgs extends ChangedArgs {
  /**
    * The index of the first modified column.
    */
  val index: Double
  /**
    * The region which contains the modified columns.
    */
  val region: ColumnRegion
  /**
    * The number of modified columns.
    */
  val span: Double
  /**
    * The discriminated type of the args object.
    */
  val `type`: `columns-inserted` | `columns-removed`
}

object ColumnsChangedArgs {
  @scala.inline
  def apply(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): ColumnsChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsChangedArgs]
  }
}

