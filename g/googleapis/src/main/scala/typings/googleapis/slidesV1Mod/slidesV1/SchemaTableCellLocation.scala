package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A location of a single table cell within a table.
  */
@js.native
trait SchemaTableCellLocation extends StObject {
  
  /**
    * The 0-based column index.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * The 0-based row index.
    */
  var rowIndex: js.UndefOr[Double] = js.native
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
  }
}
