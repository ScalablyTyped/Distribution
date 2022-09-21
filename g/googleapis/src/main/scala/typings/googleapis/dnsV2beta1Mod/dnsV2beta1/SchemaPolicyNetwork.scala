package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyNetwork extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
    */
  var networkUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicyNetwork {
  
  inline def apply(): SchemaPolicyNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyNetwork]
  }
  
  extension [Self <: SchemaPolicyNetwork](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    inline def setNetworkUrlNull: Self = StObject.set(x, "networkUrl", null)
    
    inline def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
