package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeletePhotosResponse extends StObject {
  
  /**
    * The status for the operation to delete a single Photo in the batch request.
    */
  var status: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
}
object SchemaBatchDeletePhotosResponse {
  
  inline def apply(): SchemaBatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePhotosResponse]
  }
  
  extension [Self <: SchemaBatchDeletePhotosResponse](x: Self) {
    
    inline def setStatus(value: js.Array[SchemaStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: SchemaStatus*): Self = StObject.set(x, "status", js.Array(value*))
  }
}
