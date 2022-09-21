package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateRowsRequest extends StObject {
  
  /**
    * Required. The request messages specifying the rows to update. A maximum of 500 rows can be modified in a single batch.
    */
  var requests: js.UndefOr[js.Array[SchemaUpdateRowRequest]] = js.undefined
}
object SchemaBatchUpdateRowsRequest {
  
  inline def apply(): SchemaBatchUpdateRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateRowsRequest]
  }
  
  extension [Self <: SchemaBatchUpdateRowsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaUpdateRowRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaUpdateRowRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
