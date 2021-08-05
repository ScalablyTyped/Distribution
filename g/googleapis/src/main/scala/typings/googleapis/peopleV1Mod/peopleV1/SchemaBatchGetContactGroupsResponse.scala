package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a batch get contact groups request.
  */
trait SchemaBatchGetContactGroupsResponse extends StObject {
  
  /**
    * The list of responses for each requested contact group resource.
    */
  var responses: js.UndefOr[js.Array[SchemaContactGroupResponse]] = js.undefined
}
object SchemaBatchGetContactGroupsResponse {
  
  inline def apply(): SchemaBatchGetContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetContactGroupsResponse]
  }
  
  extension [Self <: SchemaBatchGetContactGroupsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[SchemaContactGroupResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: SchemaContactGroupResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
