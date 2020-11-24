package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingRuleReference extends js.Object {
  
  var forwardingRule: js.UndefOr[String] = js.native
}
object ForwardingRuleReference {
  
  @scala.inline
  def apply(): ForwardingRuleReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRuleReference]
  }
  
  @scala.inline
  implicit class ForwardingRuleReferenceOps[Self <: ForwardingRuleReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setForwardingRule(value: String): Self = this.set("forwardingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingRule: Self = this.set("forwardingRule", js.undefined)
  }
}
