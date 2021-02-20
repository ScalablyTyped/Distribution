package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Associates `members` with a `role`.
  */
@js.native
trait SchemaBinding extends StObject {
  
  /**
    * Unimplemented. The condition that is associated with this binding. NOTE:
    * an unsatisfied condition will not allow user access via current binding.
    * Different bindings, including their conditions, are examined
    * independently.
    */
  var condition: js.UndefOr[SchemaExpr] = js.native
  
  /**
    * Specifies the identities requesting access for a Cloud Platform resource.
    * `members` can have the following values:  * `allUsers`: A special
    * identifier that represents anyone who is    on the internet; with or
    * without a Google account.  * `allAuthenticatedUsers`: A special
    * identifier that represents anyone    who is authenticated with a Google
    * account or a service account.  * `user:{emailid}`: An email address that
    * represents a specific Google    account. For example, `alice@gmail.com` .
    * * `serviceAccount:{emailid}`: An email address that represents a service
    * account. For example, `my-other-app@appspot.gserviceaccount.com`.  *
    * `group:{emailid}`: An email address that represents a Google group. For
    * example, `admins@example.com`.   * `domain:{domain}`: The G Suite domain
    * (primary) that represents all the    users of that domain. For example,
    * `google.com` or `example.com`.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`,
    * `roles/editor`, or `roles/owner`.
    */
  var role: js.UndefOr[String] = js.native
}
object SchemaBinding {
  
  @scala.inline
  def apply(): SchemaBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinding]
  }
  
  @scala.inline
  implicit class SchemaBindingMutableBuilder[Self <: SchemaBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
