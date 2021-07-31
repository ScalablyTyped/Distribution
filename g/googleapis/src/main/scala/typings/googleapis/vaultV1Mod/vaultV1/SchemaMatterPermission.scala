package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Currently each matter only has one owner, and all others are collaborators.
  * When an account is purged, its corresponding MatterPermission resources
  * cease to exist.
  */
trait SchemaMatterPermission extends StObject {
  
  /**
    * The account id, as provided by &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/&quot;&gt;Admin
    * SDK&lt;/a&gt;.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s role in this matter.
    */
  var role: js.UndefOr[String] = js.undefined
}
object SchemaMatterPermission {
  
  @scala.inline
  def apply(): SchemaMatterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatterPermission]
  }
  
  @scala.inline
  implicit class SchemaMatterPermissionMutableBuilder[Self <: SchemaMatterPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
