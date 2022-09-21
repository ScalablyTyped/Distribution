package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPushConfig extends StObject {
  
  /**
    * A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use "https://example.com/push".
    */
  var pushEndpoint: js.UndefOr[String | Null] = js.undefined
}
object SchemaPushConfig {
  
  inline def apply(): SchemaPushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushConfig]
  }
  
  extension [Self <: SchemaPushConfig](x: Self) {
    
    inline def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPushEndpointNull: Self = StObject.set(x, "pushEndpoint", null)
    
    inline def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
  }
}
