package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a push delivery endpoint.
  */
trait SchemaPushConfig extends StObject {
  
  /**
    * Endpoint configuration attributes.  Every endpoint has a set of API
    * supported attributes that can be used to control different aspects of the
    * message delivery.  The currently supported attribute is `x-goog-version`,
    * which you can use to change the format of the pushed message. This
    * attribute indicates the version of the data expected by the endpoint.
    * This controls the shape of the pushed message (i.e., its fields and
    * metadata). The endpoint version is based on the version of the Pub/Sub
    * API.  If not present during the `CreateSubscription` call, it will
    * default to the version of the API used to make such call. If not present
    * during a `ModifyPushConfig` call, its value will not be changed.
    * `GetSubscription` calls will always return a valid version, even if the
    * subscription was created without this attribute.  The possible values for
    * this attribute are:  * `v1beta1`: uses the push format defined in the
    * v1beta1 Pub/Sub API. * `v1` or `v1beta2`: uses the push format defined in
    * the v1 Pub/Sub API.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * If specified, Pub/Sub will generate and attach an OIDC JWT token as an
    * `Authorization` header in the HTTP request for every pushed message.
    */
  var oidcToken: js.UndefOr[SchemaOidcToken] = js.undefined
  
  /**
    * A URL locating the endpoint to which messages should be pushed. For
    * example, a Webhook endpoint might use
    * &quot;https://example.com/push&quot;.
    */
  var pushEndpoint: js.UndefOr[String] = js.undefined
}
object SchemaPushConfig {
  
  @scala.inline
  def apply(): SchemaPushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushConfig]
  }
  
  @scala.inline
  implicit class SchemaPushConfigMutableBuilder[Self <: SchemaPushConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setOidcToken(value: SchemaOidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
    
    @scala.inline
    def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
  }
}
