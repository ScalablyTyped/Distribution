package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetPeopleResponse extends StObject {
  
  /**
    * The response for each requested resource name.
    */
  var responses: js.UndefOr[js.Array[SchemaPersonResponse]] = js.undefined
}
object SchemaGetPeopleResponse {
  
  inline def apply(): SchemaGetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetPeopleResponse]
  }
  
  extension [Self <: SchemaGetPeopleResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaPersonResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaPersonResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
