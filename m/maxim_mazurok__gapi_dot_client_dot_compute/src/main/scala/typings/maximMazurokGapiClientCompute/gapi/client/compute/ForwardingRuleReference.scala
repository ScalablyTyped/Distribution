package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardingRuleReference extends StObject {
  
  var forwardingRule: js.UndefOr[String] = js.undefined
}
object ForwardingRuleReference {
  
  inline def apply(): ForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRuleReference]
  }
  
  extension [Self <: ForwardingRuleReference](x: Self) {
    
    inline def setForwardingRule(value: String): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    inline def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
  }
}
