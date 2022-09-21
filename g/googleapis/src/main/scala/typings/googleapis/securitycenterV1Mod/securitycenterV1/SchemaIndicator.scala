package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndicator extends StObject {
  
  /**
    * List of domains associated to the Finding.
    */
  var domains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of ip addresses associated to the Finding.
    */
  var ipAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The list of matched signatures indicating that the given process is present in the environment.
    */
  var signatures: js.UndefOr[js.Array[SchemaProcessSignature]] = js.undefined
  
  /**
    * The list of URIs associated to the Findings
    */
  var uris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIndicator {
  
  inline def apply(): SchemaIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndicator]
  }
  
  extension [Self <: SchemaIndicator](x: Self) {
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsNull: Self = StObject.set(x, "domains", null)
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesNull: Self = StObject.set(x, "ipAddresses", null)
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value*))
    
    inline def setSignatures(value: js.Array[SchemaProcessSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: SchemaProcessSignature*): Self = StObject.set(x, "signatures", js.Array(value*))
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisNull: Self = StObject.set(x, "uris", null)
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
  }
}
