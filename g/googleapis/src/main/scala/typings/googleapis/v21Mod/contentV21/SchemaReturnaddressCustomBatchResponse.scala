package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnaddressCustomBatchResponse extends StObject {
  
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[SchemaReturnaddressCustomBatchResponseEntry]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#returnaddressCustomBatchResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnaddressCustomBatchResponse {
  
  inline def apply(): SchemaReturnaddressCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnaddressCustomBatchResponse]
  }
  
  extension [Self <: SchemaReturnaddressCustomBatchResponse](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaReturnaddressCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaReturnaddressCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
