package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

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
  def apply(): SchemaAuthenticationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationRule]
  }
  @scala.inline
  implicit class SchemaAuthenticationRuleOps[Self <: SchemaAuthenticationRule] (val x: Self) extends AnyVal {
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
    def setAllowWithoutCredential(value: Boolean): Self = this.set("allowWithoutCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowWithoutCredential: Self = this.set("allowWithoutCredential", js.undefined)
    @scala.inline
    def setOauth(value: SchemaOAuthRequirements): Self = this.set("oauth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth: Self = this.set("oauth", js.undefined)
    @scala.inline
    def setRequirementsVarargs(value: SchemaAuthRequirement*): Self = this.set("requirements", js.Array(value :_*))
    @scala.inline
    def setRequirements(value: js.Array[SchemaAuthRequirement]): Self = this.set("requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

