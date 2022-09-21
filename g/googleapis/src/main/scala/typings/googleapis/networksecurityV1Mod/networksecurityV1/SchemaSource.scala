package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSource extends StObject {
  
  /**
    * Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
    */
  var ipBlocks: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, "namespace/x") or a suffix match (example, "x/service-account") or a presence match "*". Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
    */
  var principals: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSource {
  
  inline def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  extension [Self <: SchemaSource](x: Self) {
    
    inline def setIpBlocks(value: js.Array[String]): Self = StObject.set(x, "ipBlocks", value.asInstanceOf[js.Any])
    
    inline def setIpBlocksNull: Self = StObject.set(x, "ipBlocks", null)
    
    inline def setIpBlocksUndefined: Self = StObject.set(x, "ipBlocks", js.undefined)
    
    inline def setIpBlocksVarargs(value: String*): Self = StObject.set(x, "ipBlocks", js.Array(value*))
    
    inline def setPrincipals(value: js.Array[String]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsNull: Self = StObject.set(x, "principals", null)
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: String*): Self = StObject.set(x, "principals", js.Array(value*))
  }
}
