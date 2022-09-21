package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdSlot extends StObject {
  
  /**
    * Comment for this ad slot.
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ad slot compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop, mobile devices or in mobile apps for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Height of this ad slot.
    */
  var height: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the placement from an external platform that is linked to this ad slot.
    */
  var linkedPlacementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this ad slot.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Payment source type of this ad slot.
    */
  var paymentSourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Primary ad slot of a roadblock inventory item.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Width of this ad slot.
    */
  var width: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdSlot {
  
  inline def apply(): SchemaAdSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdSlot]
  }
  
  extension [Self <: SchemaAdSlot](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityNull: Self = StObject.set(x, "compatibility", null)
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLinkedPlacementId(value: String): Self = StObject.set(x, "linkedPlacementId", value.asInstanceOf[js.Any])
    
    inline def setLinkedPlacementIdNull: Self = StObject.set(x, "linkedPlacementId", null)
    
    inline def setLinkedPlacementIdUndefined: Self = StObject.set(x, "linkedPlacementId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaymentSourceType(value: String): Self = StObject.set(x, "paymentSourceType", value.asInstanceOf[js.Any])
    
    inline def setPaymentSourceTypeNull: Self = StObject.set(x, "paymentSourceType", null)
    
    inline def setPaymentSourceTypeUndefined: Self = StObject.set(x, "paymentSourceType", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
