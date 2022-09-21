package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPaygateInfo extends StObject {
  
  /**
    * Time when client should show message that the call is ending soon.
    */
  var callEndingSoonWarningTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the call will end if the user does not upgrade (after in-call upgrade support check has been implemented).
    */
  var callEndingTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This boolean is used by clients to decide whether the user should be shown promos to upgrade.
    */
  var showUpgradePromos: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPaygateInfo {
  
  inline def apply(): SchemaPaygateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPaygateInfo]
  }
  
  extension [Self <: SchemaPaygateInfo](x: Self) {
    
    inline def setCallEndingSoonWarningTime(value: String): Self = StObject.set(x, "callEndingSoonWarningTime", value.asInstanceOf[js.Any])
    
    inline def setCallEndingSoonWarningTimeNull: Self = StObject.set(x, "callEndingSoonWarningTime", null)
    
    inline def setCallEndingSoonWarningTimeUndefined: Self = StObject.set(x, "callEndingSoonWarningTime", js.undefined)
    
    inline def setCallEndingTime(value: String): Self = StObject.set(x, "callEndingTime", value.asInstanceOf[js.Any])
    
    inline def setCallEndingTimeNull: Self = StObject.set(x, "callEndingTime", null)
    
    inline def setCallEndingTimeUndefined: Self = StObject.set(x, "callEndingTime", js.undefined)
    
    inline def setShowUpgradePromos(value: Boolean): Self = StObject.set(x, "showUpgradePromos", value.asInstanceOf[js.Any])
    
    inline def setShowUpgradePromosNull: Self = StObject.set(x, "showUpgradePromos", null)
    
    inline def setShowUpgradePromosUndefined: Self = StObject.set(x, "showUpgradePromos", js.undefined)
  }
}
