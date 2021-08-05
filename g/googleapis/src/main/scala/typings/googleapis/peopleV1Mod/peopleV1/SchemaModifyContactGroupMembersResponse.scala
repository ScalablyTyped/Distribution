package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a modify contact group members request.
  */
trait SchemaModifyContactGroupMembersResponse extends StObject {
  
  /**
    * The contact people resource names that were not found.
    */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaModifyContactGroupMembersResponse {
  
  inline def apply(): SchemaModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyContactGroupMembersResponse]
  }
  
  extension [Self <: SchemaModifyContactGroupMembersResponse](x: Self) {
    
    inline def setNotFoundResourceNames(value: js.Array[String]): Self = StObject.set(x, "notFoundResourceNames", value.asInstanceOf[js.Any])
    
    inline def setNotFoundResourceNamesUndefined: Self = StObject.set(x, "notFoundResourceNames", js.undefined)
    
    inline def setNotFoundResourceNamesVarargs(value: String*): Self = StObject.set(x, "notFoundResourceNames", js.Array(value :_*))
  }
}
