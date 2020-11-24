package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to modify an existing contact group&#39;s members. Contacts can
  * be removed from any group but they can only be added to a user group or
  * myContacts or starred system groups.
  */
@js.native
trait SchemaModifyContactGroupMembersRequest extends js.Object {
  
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
  implicit class SchemaModifyContactGroupMembersRequestOps[Self <: SchemaModifyContactGroupMembersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceNamesToAddVarargs(value: String*): Self = this.set("resourceNamesToAdd", js.Array(value :_*))
    
    @scala.inline
    def setResourceNamesToAdd(value: js.Array[String]): Self = this.set("resourceNamesToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceNamesToAdd: Self = this.set("resourceNamesToAdd", js.undefined)
    
    @scala.inline
    def setResourceNamesToRemoveVarargs(value: String*): Self = this.set("resourceNamesToRemove", js.Array(value :_*))
    
    @scala.inline
    def setResourceNamesToRemove(value: js.Array[String]): Self = this.set("resourceNamesToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceNamesToRemove: Self = this.set("resourceNamesToRemove", js.undefined)
  }
}
