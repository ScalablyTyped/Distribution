package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulPolicy extends StObject {
  
  var preservedState: js.UndefOr[StatefulPolicyPreservedState] = js.native
}
object StatefulPolicy {
  
  @scala.inline
  def apply(): StatefulPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicy]
  }
  
  @scala.inline
  implicit class StatefulPolicyMutableBuilder[Self <: StatefulPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreservedState(value: StatefulPolicyPreservedState): Self = StObject.set(x, "preservedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservedStateUndefined: Self = StObject.set(x, "preservedState", js.undefined)
  }
}
