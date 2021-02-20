package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information needed for generating an [OpenID Connect
  * token](https://developers.google.com/identity/protocols/OpenIDConnect).
  */
@js.native
trait SchemaOidcToken extends StObject {
  
  /**
    * Audience to be used when generating OIDC token. The audience claim
    * identifies the recipients that the JWT is intended for. The audience
    * value is a single case-sensitive string. Having multiple values (array)
    * for the audience field is not supported. More info about the OIDC JWT
    * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
    * Note: if not specified, the Push endpoint URL will be used.
    */
  var audience: js.UndefOr[String] = js.native
  
  /**
    * [Service account
    * email](https://cloud.google.com/iam/docs/service-accounts) to be used for
    * generating the OIDC token. The caller (for CreateSubscription,
    * UpdateSubscription, and ModifyPushConfig RPCs) must have the
    * iam.serviceAccounts.actAs permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}
object SchemaOidcToken {
  
  @scala.inline
  def apply(): SchemaOidcToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOidcToken]
  }
  
  @scala.inline
  implicit class SchemaOidcTokenMutableBuilder[Self <: SchemaOidcToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
  }
}
