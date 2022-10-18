package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthbearerProviderResponse extends StObject {
  
  var value: String
}
object OauthbearerProviderResponse {
  
  inline def apply(value: String): OauthbearerProviderResponse = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthbearerProviderResponse]
  }
  
  extension [Self <: OauthbearerProviderResponse](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
