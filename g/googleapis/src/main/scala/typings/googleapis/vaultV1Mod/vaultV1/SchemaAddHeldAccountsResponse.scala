package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddHeldAccountsResponse extends StObject {
  
  /**
    * The list of responses, in the same order as the batch request.
    */
  var responses: js.UndefOr[js.Array[SchemaAddHeldAccountResult]] = js.undefined
}
object SchemaAddHeldAccountsResponse {
  
  inline def apply(): SchemaAddHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountsResponse]
  }
  
  extension [Self <: SchemaAddHeldAccountsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaAddHeldAccountResult]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaAddHeldAccountResult*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
