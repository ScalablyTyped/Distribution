package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.anon.Color1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which defines the style for a data grid.
  *
  * #### Notes
  * All style colors support the full CSS color syntax.
  */
@js.native
trait Style extends js.Object {
  
  /**
    * The background color for the body cells.
    *
    * This color is layered on top of the `voidColor`.
    */
  val backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * A function which returns the background color for a column.
    *
    * This color is layered on top of the `backgroundColor` and can
    * be used to implement "zebra striping" of the grid columns.
    */
  val columnBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  
  /**
    * The border color for the cursor.
    */
  val cursorBorderColor: js.UndefOr[String] = js.native
  
  /**
    * The fill color for the cursor.
    */
  val cursorFillColor: js.UndefOr[String] = js.native
  
  /**
    * The color for the grid lines of the body cells.
    *
    * The grid lines are draw on top of the cell contents.
    */
  val gridLineColor: js.UndefOr[String] = js.native
  
  /**
    * The background color for the header cells.
    *
    * This color is layered on top of the `voidColor`.
    */
  val headerBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * The color for the grid lines of the header cells.
    *
    * The grid lines are draw on top of the cell contents.
    */
  val headerGridLineColor: js.UndefOr[String] = js.native
  
  /**
    * The color for the horizontal grid lines of the header cells.
    *
    * This overrides the `headerGridLineColor` option.
    */
  val headerHorizontalGridLineColor: js.UndefOr[String] = js.native
  
  /**
    * The border color for a header selection.
    */
  val headerSelectionBorderColor: js.UndefOr[String] = js.native
  
  /**
    * The fill color for a header selection.
    */
  val headerSelectionFillColor: js.UndefOr[String] = js.native
  
  /**
    * The color for the vertical grid lines of the header cells.
    *
    * This overrides the `headerGridLineColor` option.
    */
  val headerVerticalGridLineColor: js.UndefOr[String] = js.native
  
  /**
    * The color for the horizontal grid lines of the body cells.
    *
    * This overrides the `gridLineColor` option.
    */
  val horizontalGridLineColor: js.UndefOr[String] = js.native
  
  /**
    * A function which returns the background color for a row.
    *
    * This color is layered on top of the `backgroundColor` and can
    * be used to implement "zebra striping" of the grid rows.
    */
  val rowBackgroundColor: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  
  /**
    * The drop shadow effect when the grid is scrolled.
    */
  val scrollShadow: js.UndefOr[Color1] = js.native
  
  /**
    * The border color for a selection.
    */
  val selectionBorderColor: js.UndefOr[String] = js.native
  
  /**
    * The fill color for a selection.
    */
  val selectionFillColor: js.UndefOr[String] = js.native
  
  /**
    * The color for the vertical grid lines of the body cells.
    *
    * This overrides the `gridLineColor` option.
    */
  val verticalGridLineColor: js.UndefOr[String] = js.native
  
  /**
    * The void color for the data grid.
    *
    * This is the base fill color for the entire data grid.
    */
  val voidColor: js.UndefOr[String] = js.native
}
object Style {
  
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColumnBackgroundColor(value: /* index */ Double => String): Self = this.set("columnBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnBackgroundColor: Self = this.set("columnBackgroundColor", js.undefined)
    
    @scala.inline
    def setCursorBorderColor(value: String): Self = this.set("cursorBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorBorderColor: Self = this.set("cursorBorderColor", js.undefined)
    
    @scala.inline
    def setCursorFillColor(value: String): Self = this.set("cursorFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorFillColor: Self = this.set("cursorFillColor", js.undefined)
    
    @scala.inline
    def setGridLineColor(value: String): Self = this.set("gridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineColor: Self = this.set("gridLineColor", js.undefined)
    
    @scala.inline
    def setHeaderBackgroundColor(value: String): Self = this.set("headerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderBackgroundColor: Self = this.set("headerBackgroundColor", js.undefined)
    
    @scala.inline
    def setHeaderGridLineColor(value: String): Self = this.set("headerGridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderGridLineColor: Self = this.set("headerGridLineColor", js.undefined)
    
    @scala.inline
    def setHeaderHorizontalGridLineColor(value: String): Self = this.set("headerHorizontalGridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHorizontalGridLineColor: Self = this.set("headerHorizontalGridLineColor", js.undefined)
    
    @scala.inline
    def setHeaderSelectionBorderColor(value: String): Self = this.set("headerSelectionBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSelectionBorderColor: Self = this.set("headerSelectionBorderColor", js.undefined)
    
    @scala.inline
    def setHeaderSelectionFillColor(value: String): Self = this.set("headerSelectionFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSelectionFillColor: Self = this.set("headerSelectionFillColor", js.undefined)
    
    @scala.inline
    def setHeaderVerticalGridLineColor(value: String): Self = this.set("headerVerticalGridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderVerticalGridLineColor: Self = this.set("headerVerticalGridLineColor", js.undefined)
    
    @scala.inline
    def setHorizontalGridLineColor(value: String): Self = this.set("horizontalGridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalGridLineColor: Self = this.set("horizontalGridLineColor", js.undefined)
    
    @scala.inline
    def setRowBackgroundColor(value: /* index */ Double => String): Self = this.set("rowBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowBackgroundColor: Self = this.set("rowBackgroundColor", js.undefined)
    
    @scala.inline
    def setScrollShadow(value: Color1): Self = this.set("scrollShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollShadow: Self = this.set("scrollShadow", js.undefined)
    
    @scala.inline
    def setSelectionBorderColor(value: String): Self = this.set("selectionBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionBorderColor: Self = this.set("selectionBorderColor", js.undefined)
    
    @scala.inline
    def setSelectionFillColor(value: String): Self = this.set("selectionFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionFillColor: Self = this.set("selectionFillColor", js.undefined)
    
    @scala.inline
    def setVerticalGridLineColor(value: String): Self = this.set("verticalGridLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalGridLineColor: Self = this.set("verticalGridLineColor", js.undefined)
    
    @scala.inline
    def setVoidColor(value: String): Self = this.set("voidColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoidColor: Self = this.set("voidColor", js.undefined)
  }
}
