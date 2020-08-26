package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing information required to activate Dashboard SSO feature.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1DashboardClient extends js.Object {
  /**
    * The id of the Oauth client that the dashboard will use.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A URI for the service dashboard. Validated by the OAuth token server when
    * the dashboard requests a token.
    */
  var redirect_uri: js.UndefOr[String] = js.native
  /**
    * A secret for the dashboard client.
    */
  var secret: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1DashboardClient {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1DashboardClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1DashboardClient]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1DashboardClientOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1DashboardClient] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
  
}

