package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryMedium extends StObject {
  
  /** Describes the medium the cent was sent/received. For example, if I receive an SMS via GV, the medium_type will be GV. */
  var mediumType: js.UndefOr[String] = js.undefined
  
  /**
    * In the case of multiple GV/native numbers, this defines the exact number to send from. It is used to differentiate mediums that have the same type, but different addresses (e.g. two
    * android phones).
    */
  var selfPhone: js.UndefOr[VoicePhoneNumber] = js.undefined
}
object DeliveryMedium {
  
  inline def apply(): DeliveryMedium = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryMedium]
  }
  
  extension [Self <: DeliveryMedium](x: Self) {
    
    inline def setMediumType(value: String): Self = StObject.set(x, "mediumType", value.asInstanceOf[js.Any])
    
    inline def setMediumTypeUndefined: Self = StObject.set(x, "mediumType", js.undefined)
    
    inline def setSelfPhone(value: VoicePhoneNumber): Self = StObject.set(x, "selfPhone", value.asInstanceOf[js.Any])
    
    inline def setSelfPhoneUndefined: Self = StObject.set(x, "selfPhone", js.undefined)
  }
}
