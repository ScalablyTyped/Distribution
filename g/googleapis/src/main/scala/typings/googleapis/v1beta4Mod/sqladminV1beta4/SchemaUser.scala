package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud SQL user resource.
  */
@js.native
trait SchemaUser extends js.Object {
  /**
    * This field is deprecated and will be removed from a future version of the
    * API.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The host name from which the user can connect. For insert operations,
    * host defaults to an empty string. For update operations, host is
    * specified as part of the request URL. The host name cannot be updated
    * after insertion.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The name of the Cloud SQL instance. This does not include the project ID.
    * Can be omitted for update since it is already specified on the URL.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * This is always sql#user.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the user in the Cloud SQL instance. Can be omitted for update
    * since it is already specified in the URL.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The password for the user.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The project ID of the project containing the Cloud SQL database. The
    * Google apps domain is prefixed if applicable. Can be omitted for update
    * since it is already specified on the URL.
    */
  var project: js.UndefOr[String] = js.native
}

object SchemaUser {
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
  
}

