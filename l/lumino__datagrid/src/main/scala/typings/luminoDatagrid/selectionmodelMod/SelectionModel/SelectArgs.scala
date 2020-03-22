package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the select args.
  */
trait SelectArgs extends js.Object {
  /**
    * The first column of the selection.
    *
    * This may be greater than `c2`.
    */
  var c1: Double
  /**
    * The last column of the selection.
    *
    * This may be less than `c1`.
    */
  var c2: Double
  /**
    * Which of the existing selections to clear.
    */
  var clear: ClearMode
  /**
    * The column index for the cursor.
    *
    * This should be contained within the selection.
    */
  var cursorColumn: Double
  /**
    * The row index for the cursor.
    *
    * This should be contained within the selection.
    */
  var cursorRow: Double
  /**
    * The first row of the selection.
    *
    * This may be greater than `r2`.
    */
  var r1: Double
  /**
    * The last row of the selection.
    *
    * This may be less than `r1`.
    */
  var r2: Double
}

object SelectArgs {
  @scala.inline
  def apply(
    c1: Double,
    c2: Double,
    clear: ClearMode,
    cursorColumn: Double,
    cursorRow: Double,
    r1: Double,
    r2: Double
  ): SelectArgs = {
    val __obj = js.Dynamic.literal(c1 = c1.asInstanceOf[js.Any], c2 = c2.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], cursorColumn = cursorColumn.asInstanceOf[js.Any], cursorRow = cursorRow.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectArgs]
  }
}

