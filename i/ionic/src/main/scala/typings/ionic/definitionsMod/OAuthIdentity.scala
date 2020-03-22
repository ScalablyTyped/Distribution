package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails} */
trait OAuthIdentity extends js.Object {
  var bitbucket_cloud: js.UndefOr[OAuthIdentityDetails] = js.undefined
  var bitbucket_server: js.UndefOr[OAuthIdentityDetails] = js.undefined
  var github: js.UndefOr[OAuthIdentityDetails] = js.undefined
}

object OAuthIdentity {
  @scala.inline
  def apply(
    bitbucket_cloud: OAuthIdentityDetails = null,
    bitbucket_server: OAuthIdentityDetails = null,
    github: OAuthIdentityDetails = null
  ): OAuthIdentity = {
    val __obj = js.Dynamic.literal()
    if (bitbucket_cloud != null) __obj.updateDynamic("bitbucket_cloud")(bitbucket_cloud.asInstanceOf[js.Any])
    if (bitbucket_server != null) __obj.updateDynamic("bitbucket_server")(bitbucket_server.asInstanceOf[js.Any])
    if (github != null) __obj.updateDynamic("github")(github.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthIdentity]
  }
}

