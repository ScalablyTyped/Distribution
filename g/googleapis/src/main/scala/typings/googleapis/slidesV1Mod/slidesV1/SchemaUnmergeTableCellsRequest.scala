package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnmergeTableCellsRequest extends StObject {
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The table range specifying which cells of the table to unmerge. All merged cells in this range will be unmerged, and cells that are already unmerged will not be affected. If the range has no merged cells, the request will do nothing. If there is text in any of the merged cells, the text will remain in the upper-left ("head") cell of the resulting block of unmerged cells.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.undefined
}
object SchemaUnmergeTableCellsRequest {
  
  inline def apply(): SchemaUnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnmergeTableCellsRequest]
  }
  
  extension [Self <: SchemaUnmergeTableCellsRequest](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTableRange(value: SchemaTableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
