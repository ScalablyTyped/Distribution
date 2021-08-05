package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Operations.ListOperations.
  */
trait SchemaListOperationsResponse extends StObject {
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of operations that matches the specified filter in the request.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
}
object SchemaListOperationsResponse {
  
  inline def apply(): SchemaListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOperationsResponse]
  }
  
  extension [Self <: SchemaListOperationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
