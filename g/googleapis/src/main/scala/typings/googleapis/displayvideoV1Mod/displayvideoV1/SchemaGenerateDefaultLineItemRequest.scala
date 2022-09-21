package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateDefaultLineItemRequest extends StObject {
  
  /**
    * Required. The display name of the line item. Must be UTF-8 encoded with a maximum size of 240 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The unique ID of the insertion order that the line item belongs to.
    */
  var insertionOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the line item.
    */
  var lineItemType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mobile app promoted by the line item. This is applicable only when line_item_type is either `LINE_ITEM_TYPE_DISPLAY_MOBILE_APP_INSTALL` or `LINE_ITEM_TYPE_VIDEO_MOBILE_APP_INSTALL`.
    */
  var mobileApp: js.UndefOr[SchemaMobileApp] = js.undefined
}
object SchemaGenerateDefaultLineItemRequest {
  
  inline def apply(): SchemaGenerateDefaultLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDefaultLineItemRequest]
  }
  
  extension [Self <: SchemaGenerateDefaultLineItemRequest](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInsertionOrderId(value: String): Self = StObject.set(x, "insertionOrderId", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrderIdNull: Self = StObject.set(x, "insertionOrderId", null)
    
    inline def setInsertionOrderIdUndefined: Self = StObject.set(x, "insertionOrderId", js.undefined)
    
    inline def setLineItemType(value: String): Self = StObject.set(x, "lineItemType", value.asInstanceOf[js.Any])
    
    inline def setLineItemTypeNull: Self = StObject.set(x, "lineItemType", null)
    
    inline def setLineItemTypeUndefined: Self = StObject.set(x, "lineItemType", js.undefined)
    
    inline def setMobileApp(value: SchemaMobileApp): Self = StObject.set(x, "mobileApp", value.asInstanceOf[js.Any])
    
    inline def setMobileAppUndefined: Self = StObject.set(x, "mobileApp", js.undefined)
  }
}
