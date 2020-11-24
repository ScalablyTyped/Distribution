package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a push delivery endpoint.
  */
@js.native
trait SchemaPushConfig extends js.Object {
  
  /**
    * Endpoint configuration attributes.  Every endpoint has a set of API
    * supported attributes that can be used to control different aspects of the
    * message delivery.  The currently supported attribute is `x-goog-version`,
    * which you can use to change the format of the push message. This
    * attribute indicates the version of the data expected by the endpoint.
    * This controls the shape of the envelope (i.e. its fields and metadata).
    * The endpoint version is based on the version of the Pub/Sub API.  If not
    * present during the `CreateSubscription` call, it will default to the
    * version of the API used to make such call. If not present during a
    * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
    * calls will always return a valid version, even if the subscription was
    * created without this attribute.  The possible values for this attribute
    * are:  * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub
    * API. * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub
    * API.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * If specified, Pub/Sub will generate and attach an OIDC JWT token as an
    * `Authorization` header in the HTTP request for every pushed message.
    */
  var oidcToken: js.UndefOr[SchemaOidcToken] = js.native
  
  /**
    * A URL locating the endpoint to which messages should be pushed. For
    * example, a Webhook endpoint might use
    * &quot;https://example.com/push&quot;.
    */
  var pushEndpoint: js.UndefOr[String] = js.native
}
object SchemaPushConfig {
  
  @scala.inline
  def apply(): SchemaPushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushConfig]
  }
  
  @scala.inline
  implicit class SchemaPushConfigOps[Self <: SchemaPushConfig] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setOidcToken(value: SchemaOidcToken): Self = this.set("oidcToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOidcToken: Self = this.set("oidcToken", js.undefined)
    
    @scala.inline
    def setPushEndpoint(value: String): Self = this.set("pushEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushEndpoint: Self = this.set("pushEndpoint", js.undefined)
  }
}
