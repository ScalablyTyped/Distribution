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
  
  @scala.inline
  def apply(): SchemaGetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetPeopleResponse]
  }
  
  @scala.inline
  implicit class SchemaGetPeopleResponseMutableBuilder[Self <: SchemaGetPeopleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[SchemaPersonResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: SchemaPersonResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
