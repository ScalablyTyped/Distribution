package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.Local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityUserLink extends js.Object {
  
  /** Entity for this link. It can be an account, a web property, or a view (profile). */
  var entity: js.UndefOr[typings.maximMazurokGapiClientAnalytics.anon.AccountRef] = js.native
  
  /** Entity user link ID */
  var id: js.UndefOr[String] = js.native
  
  /** Resource type for entity user link. */
  var kind: js.UndefOr[String] = js.native
  
  /** Permissions the user has for this entity. */
  var permissions: js.UndefOr[Local] = js.native
  
  /** Self link for this resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** User reference. */
  var userRef: js.UndefOr[UserRef] = js.native
}
object EntityUserLink {
  
  @scala.inline
  def apply(): EntityUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityUserLink]
  }
  
  @scala.inline
  implicit class EntityUserLinkOps[Self <: EntityUserLink] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: typings.maximMazurokGapiClientAnalytics.anon.AccountRef): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPermissions(value: Local): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setUserRef(value: UserRef): Self = this.set("userRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRef: Self = this.set("userRef", js.undefined)
  }
}
