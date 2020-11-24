package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulPolicy extends js.Object {
  
  var preservedState: js.UndefOr[StatefulPolicyPreservedState] = js.native
}
object StatefulPolicy {
  
  @scala.inline
  def apply(): StatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicy]
  }
  
  @scala.inline
  implicit class StatefulPolicyOps[Self <: StatefulPolicy] (val x: Self) extends AnyVal {
    
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
    def setPreservedState(value: StatefulPolicyPreservedState): Self = this.set("preservedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservedState: Self = this.set("preservedState", js.undefined)
  }
}
