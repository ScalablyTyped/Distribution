package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateRowsRequest extends StObject {
  
  /**
    * Required. The request message specifying the rows to create. A maximum of 500 rows can be created in a single batch.
    */
  var requests: js.UndefOr[js.Array[SchemaCreateRowRequest]] = js.undefined
}
object SchemaBatchCreateRowsRequest {
  
  inline def apply(): SchemaBatchCreateRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateRowsRequest]
  }
  
  extension [Self <: SchemaBatchCreateRowsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaCreateRowRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaCreateRowRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
