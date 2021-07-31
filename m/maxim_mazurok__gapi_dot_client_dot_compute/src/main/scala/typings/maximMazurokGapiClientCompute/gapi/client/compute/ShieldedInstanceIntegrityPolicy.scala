package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShieldedInstanceIntegrityPolicy extends StObject {
  
  /** Updates the integrity policy baseline using the measurements from the VM instance's most recent boot. */
  var updateAutoLearnPolicy: js.UndefOr[Boolean] = js.undefined
}
object ShieldedInstanceIntegrityPolicy {
  
  @scala.inline
  def apply(): ShieldedInstanceIntegrityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceIntegrityPolicy]
  }
  
  @scala.inline
  implicit class ShieldedInstanceIntegrityPolicyMutableBuilder[Self <: ShieldedInstanceIntegrityPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdateAutoLearnPolicy(value: Boolean): Self = StObject.set(x, "updateAutoLearnPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAutoLearnPolicyUndefined: Self = StObject.set(x, "updateAutoLearnPolicy", js.undefined)
  }
}
