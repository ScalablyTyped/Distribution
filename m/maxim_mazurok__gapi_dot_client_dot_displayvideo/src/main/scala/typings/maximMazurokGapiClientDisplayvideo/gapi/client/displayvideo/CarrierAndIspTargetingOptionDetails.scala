package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarrierAndIspTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the carrier or ISP. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. The type indicating if it's carrier or ISP. */
  var `type`: js.UndefOr[String] = js.undefined
}
object CarrierAndIspTargetingOptionDetails {
  
  inline def apply(): CarrierAndIspTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierAndIspTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CarrierAndIspTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
