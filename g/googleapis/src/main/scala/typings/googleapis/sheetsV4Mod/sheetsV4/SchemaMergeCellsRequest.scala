package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMergeCellsRequest extends StObject {
  
  /**
    * How the cells should be merged.
    */
  var mergeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The range of cells to merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaMergeCellsRequest {
  
  inline def apply(): SchemaMergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeCellsRequest]
  }
  
  extension [Self <: SchemaMergeCellsRequest](x: Self) {
    
    inline def setMergeType(value: String): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    inline def setMergeTypeNull: Self = StObject.set(x, "mergeType", null)
    
    inline def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
