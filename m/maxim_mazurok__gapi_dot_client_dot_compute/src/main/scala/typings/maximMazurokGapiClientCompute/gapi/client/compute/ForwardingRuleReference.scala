package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingRuleReference extends StObject {
  
  var forwardingRule: js.UndefOr[String] = js.native
}
object ForwardingRuleReference {
  
  @scala.inline
  def apply(): ForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRuleReference]
  }
  
  @scala.inline
  implicit class ForwardingRuleReferenceMutableBuilder[Self <: ForwardingRuleReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardingRule(value: String): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
  }
}
