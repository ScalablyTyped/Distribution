package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails} */
@js.native
trait OAuthIdentity extends js.Object {
  var bitbucket_cloud: js.UndefOr[OAuthIdentityDetails] = js.native
  var bitbucket_server: js.UndefOr[OAuthIdentityDetails] = js.native
  var github: js.UndefOr[OAuthIdentityDetails] = js.native
}

object OAuthIdentity {
  @scala.inline
  def apply(): OAuthIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthIdentity]
  }
  @scala.inline
  implicit class OAuthIdentityOps[Self <: OAuthIdentity] (val x: Self) extends AnyVal {
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
    def setBitbucket_cloud(value: OAuthIdentityDetails): Self = this.set("bitbucket_cloud", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitbucket_cloud: Self = this.set("bitbucket_cloud", js.undefined)
    @scala.inline
    def setBitbucket_server(value: OAuthIdentityDetails): Self = this.set("bitbucket_server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitbucket_server: Self = this.set("bitbucket_server", js.undefined)
    @scala.inline
    def setGithub(value: OAuthIdentityDetails): Self = this.set("github", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGithub: Self = this.set("github", js.undefined)
  }
  
}

