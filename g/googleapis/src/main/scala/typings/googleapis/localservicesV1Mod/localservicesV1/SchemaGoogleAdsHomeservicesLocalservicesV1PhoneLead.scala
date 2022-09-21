package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1PhoneLead extends StObject {
  
  /**
    * Timestamp of the phone call which resulted in a charged phone lead.
    */
  var chargedCallTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Duration of the charged phone call in seconds.
    */
  var chargedConnectedCallDurationSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Consumer phone number associated with the phone lead.
    */
  var consumerPhoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAdsHomeservicesLocalservicesV1PhoneLead {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1PhoneLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1PhoneLead]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1PhoneLead](x: Self) {
    
    inline def setChargedCallTimestamp(value: String): Self = StObject.set(x, "chargedCallTimestamp", value.asInstanceOf[js.Any])
    
    inline def setChargedCallTimestampNull: Self = StObject.set(x, "chargedCallTimestamp", null)
    
    inline def setChargedCallTimestampUndefined: Self = StObject.set(x, "chargedCallTimestamp", js.undefined)
    
    inline def setChargedConnectedCallDurationSeconds(value: String): Self = StObject.set(x, "chargedConnectedCallDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setChargedConnectedCallDurationSecondsNull: Self = StObject.set(x, "chargedConnectedCallDurationSeconds", null)
    
    inline def setChargedConnectedCallDurationSecondsUndefined: Self = StObject.set(x, "chargedConnectedCallDurationSeconds", js.undefined)
    
    inline def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setConsumerPhoneNumberNull: Self = StObject.set(x, "consumerPhoneNumber", null)
    
    inline def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
  }
}
