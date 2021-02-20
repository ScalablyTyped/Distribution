package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeType extends StObject {
  
  var endCol: Double = js.native
  
  var endRow: Double = js.native
  
  var startCol: Double = js.native
  
  var startRow: Double = js.native
}
object RangeType {
  
  @scala.inline
  def apply(endCol: Double, endRow: Double, startCol: Double, startRow: Double): RangeType = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeType]
  }
  
  @scala.inline
  implicit class RangeTypeMutableBuilder[Self <: RangeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
  }
}
