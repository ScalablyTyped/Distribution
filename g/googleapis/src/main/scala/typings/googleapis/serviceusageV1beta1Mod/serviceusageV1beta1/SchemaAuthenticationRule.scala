package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Authentication rules for the service.  By default, if a method has any
  * authentication requirements, every request must include a valid credential
  * matching one of the requirements. It&#39;s an error to include more than
  * one kind of credential in a single request.  If a method doesn&#39;t have
  * any auth requirements, request credentials will be ignored.
  */
@js.native
trait SchemaAuthenticationRule extends js.Object {
  /**
    * If true, the service accepts API keys without any other credential.
    */
  var allowWithoutCredential: js.UndefOr[Boolean] = js.native
  /**
    * The requirements for OAuth credentials.
    */
  var oauth: js.UndefOr[SchemaOAuthRequirements] = js.native
  /**
    * Requirements for additional authentication providers.
    */
  var requirements: js.UndefOr[js.Array[SchemaAuthRequirement]] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaAuthenticationRule {
  @scala.inline
  def apply(
    allowWithoutCredential: js.UndefOr[Boolean] = js.undefined,
    oauth: SchemaOAuthRequirements = null,
    requirements: js.Array[SchemaAuthRequirement] = null,
    selector: String = null
  ): SchemaAuthenticationRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWithoutCredential)) __obj.updateDynamic("allowWithoutCredential")(allowWithoutCredential.get.asInstanceOf[js.Any])
    if (oauth != null) __obj.updateDynamic("oauth")(oauth.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthenticationRule]
  }
}

