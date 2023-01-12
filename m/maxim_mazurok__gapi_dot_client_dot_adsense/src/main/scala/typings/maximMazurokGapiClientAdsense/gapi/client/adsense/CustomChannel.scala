package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomChannel extends StObject {
  
  /** Required. Display name of the custom channel. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of the custom channel. Format: accounts/{account}/adclients/{adclient}/customchannels/{customchannel} */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Unique ID of the custom channel as used in the `CUSTOM_CHANNEL_ID` reporting dimension. */
  var reportingDimensionId: js.UndefOr[String] = js.undefined
}
object CustomChannel {
  
  inline def apply(): CustomChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomChannel] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
  }
}
