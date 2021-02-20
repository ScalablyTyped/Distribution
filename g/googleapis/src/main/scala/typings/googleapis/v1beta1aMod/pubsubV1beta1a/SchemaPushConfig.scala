package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a push delivery endpoint.
  */
@js.native
trait SchemaPushConfig extends StObject {
  
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
  implicit class SchemaPushConfigMutableBuilder[Self <: SchemaPushConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
  }
}
