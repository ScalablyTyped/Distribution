package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Member resource in Directory API.
  */
@js.native
trait SchemaMember extends js.Object {
  /**
    * Delivery settings of member
    */
  var delivery_settings: js.UndefOr[String] = js.native
  /**
    * Email of member (Read-only)
    */
  var email: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Unique identifier of customer member (Read-only) Unique identifier of
    * group (Read-only) Unique identifier of member (Read-only)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Role of member
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Status of member (Immutable)
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Type of member (Immutable)
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMember {
  @scala.inline
  def apply(): SchemaMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMember]
  }
  @scala.inline
  implicit class SchemaMemberOps[Self <: SchemaMember] (val x: Self) extends AnyVal {
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
    def setDelivery_settings(value: String): Self = this.set("delivery_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelivery_settings: Self = this.set("delivery_settings", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

