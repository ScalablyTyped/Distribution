package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterconnectCircuitInfo extends StObject {
  
  /** Customer-side demarc ID for this circuit. */
  var customerDemarcId: js.UndefOr[String] = js.native
  
  /** Google-assigned unique ID for this circuit. Assigned at circuit turn-up. */
  var googleCircuitId: js.UndefOr[String] = js.native
  
  /** Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA. */
  var googleDemarcId: js.UndefOr[String] = js.native
}
object InterconnectCircuitInfo {
  
  @scala.inline
  def apply(): InterconnectCircuitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterconnectCircuitInfo]
  }
  
  @scala.inline
  implicit class InterconnectCircuitInfoMutableBuilder[Self <: InterconnectCircuitInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerDemarcId(value: String): Self = StObject.set(x, "customerDemarcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerDemarcIdUndefined: Self = StObject.set(x, "customerDemarcId", js.undefined)
    
    @scala.inline
    def setGoogleCircuitId(value: String): Self = StObject.set(x, "googleCircuitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleCircuitIdUndefined: Self = StObject.set(x, "googleCircuitId", js.undefined)
    
    @scala.inline
    def setGoogleDemarcId(value: String): Self = StObject.set(x, "googleDemarcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleDemarcIdUndefined: Self = StObject.set(x, "googleDemarcId", js.undefined)
  }
}
