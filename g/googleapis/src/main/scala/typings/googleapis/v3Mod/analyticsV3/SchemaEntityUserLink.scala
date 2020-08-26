package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.AccountRef
import typings.googleapis.anon.Local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics Entity-User Link. Returns permissions that a
  * user has for an entity.
  */
@js.native
trait SchemaEntityUserLink extends js.Object {
  /**
    * Entity for this link. It can be an account, a web property, or a view
    * (profile).
    */
  var entity: js.UndefOr[AccountRef] = js.native
  /**
    * Entity user link ID
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for entity user link.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Permissions the user has for this entity.
    */
  var permissions: js.UndefOr[Local] = js.native
  /**
    * Self link for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * User reference.
    */
  var userRef: js.UndefOr[SchemaUserRef] = js.native
}

object SchemaEntityUserLink {
  @scala.inline
  def apply(): SchemaEntityUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityUserLink]
  }
  @scala.inline
  implicit class SchemaEntityUserLinkOps[Self <: SchemaEntityUserLink] (val x: Self) extends AnyVal {
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
    def setEntity(value: AccountRef): Self = this.set("entity", value.asInstanceOf[js.Any])
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
    def setUserRef(value: SchemaUserRef): Self = this.set("userRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserRef: Self = this.set("userRef", js.undefined)
  }
  
}

