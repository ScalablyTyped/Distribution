package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties and contents of each table cell.
  */
@js.native
trait SchemaTableCell extends StObject {
  
  /**
    * Column span of the cell.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  
  /**
    * The location of the cell within the table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  
  /**
    * Row span of the cell.
    */
  var rowSpan: js.UndefOr[Double] = js.native
  
  /**
    * The properties of the table cell.
    */
  var tableCellProperties: js.UndefOr[SchemaTableCellProperties] = js.native
  
  /**
    * The text content of the cell.
    */
  var text: js.UndefOr[SchemaTextContent] = js.native
}
object SchemaTableCell {
  
  @scala.inline
  def apply(): SchemaTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCell]
  }
  
  @scala.inline
  implicit class SchemaTableCellMutableBuilder[Self <: SchemaTableCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    @scala.inline
    def setTableCellProperties(value: SchemaTableCellProperties): Self = StObject.set(x, "tableCellProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellPropertiesUndefined: Self = StObject.set(x, "tableCellProperties", js.undefined)
    
    @scala.inline
    def setText(value: SchemaTextContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
