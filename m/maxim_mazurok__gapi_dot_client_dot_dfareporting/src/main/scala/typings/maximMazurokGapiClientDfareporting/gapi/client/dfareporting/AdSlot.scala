package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdSlot extends StObject {
  
  /** Comment for this ad slot. */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Ad slot compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop, mobile devices or in mobile apps for regular or interstitial ads respectively. APP and
    * APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.undefined
  
  /** Height of this ad slot. */
  var height: js.UndefOr[String] = js.undefined
  
  /** ID of the placement from an external platform that is linked to this ad slot. */
  var linkedPlacementId: js.UndefOr[String] = js.undefined
  
  /** Name of this ad slot. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Payment source type of this ad slot. */
  var paymentSourceType: js.UndefOr[String] = js.undefined
  
  /** Primary ad slot of a roadblock inventory item. */
  var primary: js.UndefOr[Boolean] = js.undefined
  
  /** Width of this ad slot. */
  var width: js.UndefOr[String] = js.undefined
}
object AdSlot {
  
  @scala.inline
  def apply(): AdSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdSlot]
  }
  
  @scala.inline
  implicit class AdSlotMutableBuilder[Self <: AdSlot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLinkedPlacementId(value: String): Self = StObject.set(x, "linkedPlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedPlacementIdUndefined: Self = StObject.set(x, "linkedPlacementId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPaymentSourceType(value: String): Self = StObject.set(x, "paymentSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentSourceTypeUndefined: Self = StObject.set(x, "paymentSourceType", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
