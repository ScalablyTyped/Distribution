package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarrierAndIspTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the carrier or ISP. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The type indicating if it's carrier or ISP. */
  var `type`: js.UndefOr[String] = js.native
}
object CarrierAndIspTargetingOptionDetails {
  
  @scala.inline
  def apply(): CarrierAndIspTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierAndIspTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class CarrierAndIspTargetingOptionDetailsMutableBuilder[Self <: CarrierAndIspTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
