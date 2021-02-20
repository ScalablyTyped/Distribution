package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends StObject {
  
  var col: Double = js.native
  
  var data: CellValue = js.native
  
  var row: Double = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(col: Double, data: CellValue, row: Double): SearchResult = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: CellValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
