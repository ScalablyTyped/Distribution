package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Merges cells in a Table.
  */
trait SchemaMergeTableCellsRequest extends StObject {
  
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The table range specifying which cells of the table to merge.  Any text
    * in the cells being merged will be concatenated and stored in the
    * upper-left (&quot;head&quot;) cell of the range. If the range is
    * non-rectangular (which can occur in some cases where the range covers
    * cells that are already merged), a 400 bad request error is returned.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.undefined
}
object SchemaMergeTableCellsRequest {
  
  inline def apply(): SchemaMergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeTableCellsRequest]
  }
  
  extension [Self <: SchemaMergeTableCellsRequest](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setTableRange(value: SchemaTableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
