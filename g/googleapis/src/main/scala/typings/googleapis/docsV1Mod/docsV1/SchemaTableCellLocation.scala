package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location of a single cell within a table.
  */
trait SchemaTableCellLocation extends StObject {
  
  /**
    * The zero-based column index. For example, the second column in the table
    * has a column index of 1.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based row index. For example, the second row in the table has a
    * row index of 1.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The location where the table starts in the document.
    */
  var tableStartLocation: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaTableCellLocation {
  
  @scala.inline
  def apply(): SchemaTableCellLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellLocation]
  }
  
  @scala.inline
  implicit class SchemaTableCellLocationMutableBuilder[Self <: SchemaTableCellLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setTableStartLocation(value: SchemaLocation): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
