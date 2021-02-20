package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a modify contact group members request.
  */
@js.native
trait SchemaModifyContactGroupMembersResponse extends StObject {
  
  /**
    * The contact people resource names that were not found.
    */
  var notFoundResourceNames: js.UndefOr[js.Array[String]] = js.native
}
object SchemaModifyContactGroupMembersResponse {
  
  @scala.inline
  def apply(): SchemaModifyContactGroupMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyContactGroupMembersResponse]
  }
  
  @scala.inline
  implicit class SchemaModifyContactGroupMembersResponseMutableBuilder[Self <: SchemaModifyContactGroupMembersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotFoundResourceNames(value: js.Array[String]): Self = StObject.set(x, "notFoundResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundResourceNamesUndefined: Self = StObject.set(x, "notFoundResourceNames", js.undefined)
    
    @scala.inline
    def setNotFoundResourceNamesVarargs(value: String*): Self = StObject.set(x, "notFoundResourceNames", js.Array(value :_*))
  }
}
