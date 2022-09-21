package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthConsumerProto extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
}
object OAuthConsumerProto {
  
  inline def apply(): OAuthConsumerProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthConsumerProto]
  }
  
  extension [Self <: OAuthConsumerProto](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
