package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to modify an existing contact group&#39;s members. Contacts can
  * be removed from any group but they can only be added to a user group or
  * myContacts or starred system groups.
  */
trait SchemaModifyContactGroupMembersRequest extends StObject {
  
  /**
    * The resource names of the contact people to add in the form of in the
    * form `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource names of the contact people to remove in the form of in the
    * form of `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaModifyContactGroupMembersRequest {
  
  inline def apply(): SchemaModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyContactGroupMembersRequest]
  }
  
  extension [Self <: SchemaModifyContactGroupMembersRequest](x: Self) {
    
    inline def setResourceNamesToAdd(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToAdd", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesToAddUndefined: Self = StObject.set(x, "resourceNamesToAdd", js.undefined)
    
    inline def setResourceNamesToAddVarargs(value: String*): Self = StObject.set(x, "resourceNamesToAdd", js.Array(value :_*))
    
    inline def setResourceNamesToRemove(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToRemove", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesToRemoveUndefined: Self = StObject.set(x, "resourceNamesToRemove", js.undefined)
    
    inline def setResourceNamesToRemoveVarargs(value: String*): Self = StObject.set(x, "resourceNamesToRemove", js.Array(value :_*))
  }
}
