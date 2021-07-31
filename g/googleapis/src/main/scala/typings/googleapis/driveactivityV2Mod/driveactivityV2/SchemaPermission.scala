package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The permission setting of an object.
  */
trait SchemaPermission extends StObject {
  
  /**
    * If true, the item can be discovered (e.g. in the user&#39;s &quot;Shared
    * with me&quot; collection) without needing a link to the item.
    */
  var allowDiscovery: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, this permission applies to anyone, even logged out users.
    */
  var anyone: js.UndefOr[SchemaAnyone] = js.undefined
  
  /**
    * The domain to whom this permission applies.
    */
  var domain: js.UndefOr[SchemaDomain] = js.undefined
  
  /**
    * The group to whom this permission applies.
    */
  var group: js.UndefOr[SchemaGroup] = js.undefined
  
  /**
    * Indicates the &lt;a
    * href=&quot;/drive/web/manage-sharing#roles&quot;&gt;Google Drive
    * permissions role&lt;/a&gt;. The role determines a user&#39;s ability to
    * read, write, and comment on items.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * The user to whom this permission applies.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaPermission {
  
  @scala.inline
  def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  @scala.inline
  implicit class SchemaPermissionMutableBuilder[Self <: SchemaPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDiscovery(value: Boolean): Self = StObject.set(x, "allowDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDiscoveryUndefined: Self = StObject.set(x, "allowDiscovery", js.undefined)
    
    @scala.inline
    def setAnyone(value: SchemaAnyone): Self = StObject.set(x, "anyone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyoneUndefined: Self = StObject.set(x, "anyone", js.undefined)
    
    @scala.inline
    def setDomain(value: SchemaDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setGroup(value: SchemaGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
