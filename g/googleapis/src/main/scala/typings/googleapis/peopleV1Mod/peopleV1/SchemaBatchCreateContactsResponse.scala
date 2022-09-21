package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateContactsResponse extends StObject {
  
  /**
    * The contacts that were created, unless the request `read_mask` is empty.
    */
  var createdPeople: js.UndefOr[js.Array[SchemaPersonResponse]] = js.undefined
}
object SchemaBatchCreateContactsResponse {
  
  inline def apply(): SchemaBatchCreateContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateContactsResponse]
  }
  
  extension [Self <: SchemaBatchCreateContactsResponse](x: Self) {
    
    inline def setCreatedPeople(value: js.Array[SchemaPersonResponse]): Self = StObject.set(x, "createdPeople", value.asInstanceOf[js.Any])
    
    inline def setCreatedPeopleUndefined: Self = StObject.set(x, "createdPeople", js.undefined)
    
    inline def setCreatedPeopleVarargs(value: SchemaPersonResponse*): Self = StObject.set(x, "createdPeople", js.Array(value*))
  }
}
