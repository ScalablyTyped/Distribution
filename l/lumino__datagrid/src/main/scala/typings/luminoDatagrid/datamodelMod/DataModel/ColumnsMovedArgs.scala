package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`columns-moved`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when columns are moved.
  */
trait ColumnsMovedArgs extends ChangedArgs {
  /**
    * The ending index of the first modified column.
    */
  val destination: Double
  /**
    * The starting index of the first modified column.
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
  val `type`: `columns-moved`
}

object ColumnsMovedArgs {
  @scala.inline
  def apply(destination: Double, index: Double, region: ColumnRegion, span: Double, `type`: `columns-moved`): ColumnsMovedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsMovedArgs]
  }
}

