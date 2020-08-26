package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Trusted Apps response object of a user in Directory API.
  */
@js.native
trait SchemaTrustedApps extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as trusted apps response.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Trusted Apps list.
    */
  var trustedApps: js.UndefOr[js.Array[SchemaTrustedAppId]] = js.native
}

object SchemaTrustedApps {
  @scala.inline
  def apply(): SchemaTrustedApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrustedApps]
  }
  @scala.inline
  implicit class SchemaTrustedAppsOps[Self <: SchemaTrustedApps] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTrustedAppsVarargs(value: SchemaTrustedAppId*): Self = this.set("trustedApps", js.Array(value :_*))
    @scala.inline
    def setTrustedApps(value: js.Array[SchemaTrustedAppId]): Self = this.set("trustedApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustedApps: Self = this.set("trustedApps", js.undefined)
  }
  
}

