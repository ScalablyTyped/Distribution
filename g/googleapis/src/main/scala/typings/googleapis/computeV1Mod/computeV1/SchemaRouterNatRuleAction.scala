package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterNatRuleAction extends StObject {
  
  /**
    * A list of URLs of the IP resources used for this NAT rule. These IP addresses must be valid static external IP addresses assigned to the project. This field is used for public NAT.
    */
  var sourceNatActiveIps: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT rule only. This field is used for public NAT.
    */
  var sourceNatDrainIps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRouterNatRuleAction {
  
  inline def apply(): SchemaRouterNatRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNatRuleAction]
  }
  
  extension [Self <: SchemaRouterNatRuleAction](x: Self) {
    
    inline def setSourceNatActiveIps(value: js.Array[String]): Self = StObject.set(x, "sourceNatActiveIps", value.asInstanceOf[js.Any])
    
    inline def setSourceNatActiveIpsNull: Self = StObject.set(x, "sourceNatActiveIps", null)
    
    inline def setSourceNatActiveIpsUndefined: Self = StObject.set(x, "sourceNatActiveIps", js.undefined)
    
    inline def setSourceNatActiveIpsVarargs(value: String*): Self = StObject.set(x, "sourceNatActiveIps", js.Array(value*))
    
    inline def setSourceNatDrainIps(value: js.Array[String]): Self = StObject.set(x, "sourceNatDrainIps", value.asInstanceOf[js.Any])
    
    inline def setSourceNatDrainIpsNull: Self = StObject.set(x, "sourceNatDrainIps", null)
    
    inline def setSourceNatDrainIpsUndefined: Self = StObject.set(x, "sourceNatDrainIps", js.undefined)
    
    inline def setSourceNatDrainIpsVarargs(value: String*): Self = StObject.set(x, "sourceNatDrainIps", js.Array(value*))
  }
}
