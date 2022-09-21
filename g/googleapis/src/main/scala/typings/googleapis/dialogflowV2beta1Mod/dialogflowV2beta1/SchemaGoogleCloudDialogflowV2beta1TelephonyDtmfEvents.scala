package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1TelephonyDtmfEvents extends StObject {
  
  /**
    * A sequence of TelephonyDtmf digits.
    */
  var dtmfEvents: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1TelephonyDtmfEvents {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1TelephonyDtmfEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1TelephonyDtmfEvents]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1TelephonyDtmfEvents](x: Self) {
    
    inline def setDtmfEvents(value: js.Array[String]): Self = StObject.set(x, "dtmfEvents", value.asInstanceOf[js.Any])
    
    inline def setDtmfEventsNull: Self = StObject.set(x, "dtmfEvents", null)
    
    inline def setDtmfEventsUndefined: Self = StObject.set(x, "dtmfEvents", js.undefined)
    
    inline def setDtmfEventsVarargs(value: String*): Self = StObject.set(x, "dtmfEvents", js.Array(value*))
  }
}
