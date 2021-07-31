package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionPosition extends StObject {
  
  var column: Double
  
  var row: Double
}
object SelectionPosition {
  
  @scala.inline
  def apply(column: Double, row: Double): SelectionPosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionPosition]
  }
  
  @scala.inline
  implicit class SelectionPositionMutableBuilder[Self <: SelectionPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
