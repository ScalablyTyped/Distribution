package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertDnsChallenge extends StObject {
  
  /**
    * The domain name upon which the DNS challenge must be satisfied.
    */
  var domainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value that must be present as a TXT record on the domain name to satisfy the challenge.
    */
  var token: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertDnsChallenge {
  
  inline def apply(): SchemaCertDnsChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertDnsChallenge]
  }
  
  extension [Self <: SchemaCertDnsChallenge](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
