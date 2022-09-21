package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeleteContactsRequest extends StObject {
  
  /**
    * Required. The resource names of the contact to delete. It's repeatable. Allows up to 500 resource names in a single request.
    */
  var resourceNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchDeleteContactsRequest {
  
  inline def apply(): SchemaBatchDeleteContactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteContactsRequest]
  }
  
  extension [Self <: SchemaBatchDeleteContactsRequest](x: Self) {
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesNull: Self = StObject.set(x, "resourceNames", null)
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
  }
}
