package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to modify an existing contact group&#39;s members. Contacts can
  * be removed from any group but they can only be added to a user group or
  * myContacts or starred system groups.
  */
@js.native
trait SchemaModifyContactGroupMembersRequest extends StObject {
  
  /**
    * The resource names of the contact people to add in the form of in the
    * form `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToAdd: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The resource names of the contact people to remove in the form of in the
    * form of `people/`&lt;var&gt;person_id&lt;/var&gt;.
    */
  var resourceNamesToRemove: js.UndefOr[js.Array[String]] = js.native
}
object SchemaModifyContactGroupMembersRequest {
  
  @scala.inline
  def apply(): SchemaModifyContactGroupMembersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyContactGroupMembersRequest]
  }
  
  @scala.inline
  implicit class SchemaModifyContactGroupMembersRequestMutableBuilder[Self <: SchemaModifyContactGroupMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceNamesToAdd(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNamesToAddUndefined: Self = StObject.set(x, "resourceNamesToAdd", js.undefined)
    
    @scala.inline
    def setResourceNamesToAddVarargs(value: String*): Self = StObject.set(x, "resourceNamesToAdd", js.Array(value :_*))
    
    @scala.inline
    def setResourceNamesToRemove(value: js.Array[String]): Self = StObject.set(x, "resourceNamesToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNamesToRemoveUndefined: Self = StObject.set(x, "resourceNamesToRemove", js.undefined)
    
    @scala.inline
    def setResourceNamesToRemoveVarargs(value: String*): Self = StObject.set(x, "resourceNamesToRemove", js.Array(value :_*))
  }
}
