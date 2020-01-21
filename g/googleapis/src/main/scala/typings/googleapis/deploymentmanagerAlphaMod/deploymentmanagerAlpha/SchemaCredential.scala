package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The credential used by Deployment Manager and TypeProvider. Only one of the
  * options is permitted.
  */
@js.native
trait SchemaCredential extends js.Object {
  /**
    * Basic Auth Credential, only used by TypeProvider.
    */
  var basicAuth: js.UndefOr[SchemaBasicAuth] = js.native
  /**
    * Service Account Credential, only used by Deployment.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
  /**
    * Specify to use the project default credential, only supported by
    * Deployment.
    */
  var useProjectDefault: js.UndefOr[Boolean] = js.native
}

object SchemaCredential {
  @scala.inline
  def apply(
    basicAuth: SchemaBasicAuth = null,
    serviceAccount: SchemaServiceAccount = null,
    useProjectDefault: js.UndefOr[Boolean] = js.undefined
  ): SchemaCredential = {
    val __obj = js.Dynamic.literal()
    if (basicAuth != null) __obj.updateDynamic("basicAuth")(basicAuth.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (!js.isUndefined(useProjectDefault)) __obj.updateDynamic("useProjectDefault")(useProjectDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCredential]
  }
}

