package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the select args.
  */
@js.native
trait SelectArgs extends js.Object {
  /**
    * The first column of the selection.
    *
    * This may be greater than `c2`.
    */
  var c1: Double = js.native
  /**
    * The last column of the selection.
    *
    * This may be less than `c1`.
    */
  var c2: Double = js.native
  /**
    * Which of the existing selections to clear.
    */
  var clear: ClearMode = js.native
  /**
    * The column index for the cursor.
    *
    * This should be contained within the selection.
    */
  var cursorColumn: Double = js.native
  /**
    * The row index for the cursor.
    *
    * This should be contained within the selection.
    */
  var cursorRow: Double = js.native
  /**
    * The first row of the selection.
    *
    * This may be greater than `r2`.
    */
  var r1: Double = js.native
  /**
    * The last row of the selection.
    *
    * This may be less than `r1`.
    */
  var r2: Double = js.native
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
  @scala.inline
  implicit class SelectArgsOps[Self <: SelectArgs] (val x: Self) extends AnyVal {
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
    def setC1(value: Double): Self = this.set("c1", value.asInstanceOf[js.Any])
    @scala.inline
    def setC2(value: Double): Self = this.set("c2", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: ClearMode): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorColumn(value: Double): Self = this.set("cursorColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorRow(value: Double): Self = this.set("cursorRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setR1(value: Double): Self = this.set("r1", value.asInstanceOf[js.Any])
    @scala.inline
    def setR2(value: Double): Self = this.set("r2", value.asInstanceOf[js.Any])
  }
  
}

