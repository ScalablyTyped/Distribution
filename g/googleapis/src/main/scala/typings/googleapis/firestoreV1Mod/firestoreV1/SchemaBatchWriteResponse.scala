package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchWriteResponse extends StObject {
  
  /**
    * The status of applying the writes. This i-th write status corresponds to the i-th write in the request.
    */
  var status: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
  
  /**
    * The result of applying the writes. This i-th write result corresponds to the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.undefined
}
object SchemaBatchWriteResponse {
  
  inline def apply(): SchemaBatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchWriteResponse]
  }
  
  extension [Self <: SchemaBatchWriteResponse](x: Self) {
    
    inline def setStatus(value: js.Array[SchemaStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: SchemaStatus*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setWriteResults(value: js.Array[SchemaWriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: SchemaWriteResult*): Self = StObject.set(x, "writeResults", js.Array(value*))
  }
}
