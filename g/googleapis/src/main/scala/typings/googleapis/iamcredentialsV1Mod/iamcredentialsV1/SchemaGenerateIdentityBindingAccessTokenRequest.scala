package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGenerateIdentityBindingAccessTokenRequest extends StObject {
  
  /**
    * Required. Input token. Must be in JWT format according to RFC7523
    * (https://tools.ietf.org/html/rfc7523) and must have &#39;kid&#39; field
    * in the header. Supported signing algorithms: RS256 (RS512, ES256, ES512
    * coming soon). Mandatory payload fields (along the lines of RFC 7523,
    * section 3): - iss: issuer of the token. Must provide a discovery document
    * at        $iss/.well-known/openid-configuration . The document needs to
    * be        formatted according to section 4.2 of the OpenID Connect
    * Discovery        1.0 specification. - iat: Issue time in seconds since
    * epoch. Must be in the past. - exp: Expiration time in seconds since
    * epoch. Must be less than 48 hours        after iat. We recommend to
    * create tokens that last shorter than 6        hours to improve security
    * unless business reasons mandate longer        expiration times. Shorter
    * token lifetimes are generally more secure        since tokens that have
    * been exfiltrated by attackers can be used for        a shorter time. you
    * can configure the maximum lifetime of the        incoming token in the
    * configuration of the mapper.        The resulting Google token will
    * expire within an hour or at &quot;exp&quot;,        whichever is earlier.
    * - sub: JWT subject, identity asserted in the JWT. - aud: Configured in
    * the mapper policy. By default the service account        email.  Claims
    * from the incoming token can be transferred into the output token accoding
    * to the mapper configuration. The outgoing claim size is limited. Outgoing
    * claims size must be less than 4kB serialized as JSON without whitespace.
    * Example header: {   &quot;alg&quot;: &quot;RS256&quot;, &quot;kid&quot;:
    * &quot;92a4265e14ab04d4d228a48d10d4ca31610936f8&quot; } Example payload: {
    * &quot;iss&quot;: &quot;https://accounts.google.com&quot;,
    * &quot;iat&quot;: 1517963104,   &quot;exp&quot;: 1517966704,
    * &quot;aud&quot;:
    * &quot;https://iamcredentials.googleapis.com/google.iam.credentials.v1.CloudGaia&quot;,
    * &quot;sub&quot;: &quot;113475438248934895348&quot;,
    * &quot;my_claims&quot;: {     &quot;additional_claim&quot;:
    * &quot;value&quot;   } }
    */
  var jwt: js.UndefOr[String] = js.native
  
  /**
    * Code to identify the scopes to be included in the OAuth 2.0 access token.
    * See https://developers.google.com/identity/protocols/googlescopes for
    * more information. At least one value required.
    */
  var scope: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGenerateIdentityBindingAccessTokenRequest {
  
  @scala.inline
  def apply(): SchemaGenerateIdentityBindingAccessTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateIdentityBindingAccessTokenRequest]
  }
  
  @scala.inline
  implicit class SchemaGenerateIdentityBindingAccessTokenRequestMutableBuilder[Self <: SchemaGenerateIdentityBindingAccessTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJwt(value: String): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
