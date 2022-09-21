package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaygateInfo extends StObject {
  
  /** Time when client should show message that the call is ending soon. */
  var callEndingSoonWarningTime: js.UndefOr[String] = js.undefined
  
  /** Time when the call will end if the user does not upgrade (after in-call upgrade support check has been implemented). */
  var callEndingTime: js.UndefOr[String] = js.undefined
  
  /** This boolean is used by clients to decide whether the user should be shown promos to upgrade. */
  var showUpgradePromos: js.UndefOr[Boolean] = js.undefined
}
object PaygateInfo {
  
  inline def apply(): PaygateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaygateInfo]
  }
  
  extension [Self <: PaygateInfo](x: Self) {
    
    inline def setCallEndingSoonWarningTime(value: String): Self = StObject.set(x, "callEndingSoonWarningTime", value.asInstanceOf[js.Any])
    
    inline def setCallEndingSoonWarningTimeUndefined: Self = StObject.set(x, "callEndingSoonWarningTime", js.undefined)
    
    inline def setCallEndingTime(value: String): Self = StObject.set(x, "callEndingTime", value.asInstanceOf[js.Any])
    
    inline def setCallEndingTimeUndefined: Self = StObject.set(x, "callEndingTime", js.undefined)
    
    inline def setShowUpgradePromos(value: Boolean): Self = StObject.set(x, "showUpgradePromos", value.asInstanceOf[js.Any])
    
    inline def setShowUpgradePromosUndefined: Self = StObject.set(x, "showUpgradePromos", js.undefined)
  }
}
