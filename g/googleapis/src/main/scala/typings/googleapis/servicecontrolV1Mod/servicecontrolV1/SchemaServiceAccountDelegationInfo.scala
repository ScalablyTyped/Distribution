package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity delegation history of an authenticated service account.
  */
@js.native
trait SchemaServiceAccountDelegationInfo extends js.Object {
  /**
    * First party (Google) identity as the real authority.
    */
  var firstPartyPrincipal: js.UndefOr[SchemaFirstPartyPrincipal] = js.native
  /**
    * Third party identity as the real authority.
    */
  var thirdPartyPrincipal: js.UndefOr[SchemaThirdPartyPrincipal] = js.native
}

object SchemaServiceAccountDelegationInfo {
  @scala.inline
  def apply(
    firstPartyPrincipal: SchemaFirstPartyPrincipal = null,
    thirdPartyPrincipal: SchemaThirdPartyPrincipal = null
  ): SchemaServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    if (firstPartyPrincipal != null) __obj.updateDynamic("firstPartyPrincipal")(firstPartyPrincipal.asInstanceOf[js.Any])
    if (thirdPartyPrincipal != null) __obj.updateDynamic("thirdPartyPrincipal")(thirdPartyPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceAccountDelegationInfo]
  }
}

