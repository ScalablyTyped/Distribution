package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdateContactsResponse extends StObject {
  
  /**
    * A map of resource names to the contacts that were updated, unless the request `read_mask` is empty.
    */
  var updateResult: js.UndefOr[StringDictionary[SchemaPersonResponse] | Null] = js.undefined
}
object SchemaBatchUpdateContactsResponse {
  
  inline def apply(): SchemaBatchUpdateContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateContactsResponse]
  }
  
  extension [Self <: SchemaBatchUpdateContactsResponse](x: Self) {
    
    inline def setUpdateResult(value: StringDictionary[SchemaPersonResponse]): Self = StObject.set(x, "updateResult", value.asInstanceOf[js.Any])
    
    inline def setUpdateResultNull: Self = StObject.set(x, "updateResult", null)
    
    inline def setUpdateResultUndefined: Self = StObject.set(x, "updateResult", js.undefined)
  }
}
