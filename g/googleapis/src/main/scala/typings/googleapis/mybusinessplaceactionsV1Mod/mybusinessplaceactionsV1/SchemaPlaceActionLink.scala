package typings.googleapis.mybusinessplaceactionsV1Mod.mybusinessplaceactionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaceActionLink extends StObject {
  
  /**
    * Output only. The time when the place action link was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether this link can be edited by the client.
    */
  var isEditable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Whether this link is preferred by the merchant. Only one link can be marked as preferred per place action type at a location. If a future request marks a different link as preferred for the same place action type, then the current preferred link (if any exists) will lose its preference.
    */
  var isPreferred: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The resource name, in the format `locations/{location_id\}/placeActionLinks/{place_action_link_id\}`. The name field will only be considered in UpdatePlaceActionLink and DeletePlaceActionLink requests for updating and deleting links respectively. However, it will be ignored in CreatePlaceActionLink request, where `place_action_link_id` will be assigned by the server on successful creation of a new link and returned as part of the response.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Metadata for the order online link. Supports action with PlaceActionType of SHOP_ONLINE.
    */
  var orderOnlineMetadata: js.UndefOr[SchemaOrderOnlineMetadata] = js.undefined
  
  /**
    * Required. The type of place action that can be performed using this link.
    */
  var placeActionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Specifies the provider type.
    */
  var providerType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the place action link was last modified.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The link uri. The same uri can be reused for different action types across different locations. However, only one place action link is allowed for each unique combination of (uri, place action type, location).
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaceActionLink {
  
  inline def apply(): SchemaPlaceActionLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaceActionLink]
  }
  
  extension [Self <: SchemaPlaceActionLink](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setIsEditableNull: Self = StObject.set(x, "isEditable", null)
    
    inline def setIsEditableUndefined: Self = StObject.set(x, "isEditable", js.undefined)
    
    inline def setIsPreferred(value: Boolean): Self = StObject.set(x, "isPreferred", value.asInstanceOf[js.Any])
    
    inline def setIsPreferredNull: Self = StObject.set(x, "isPreferred", null)
    
    inline def setIsPreferredUndefined: Self = StObject.set(x, "isPreferred", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrderOnlineMetadata(value: SchemaOrderOnlineMetadata): Self = StObject.set(x, "orderOnlineMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrderOnlineMetadataUndefined: Self = StObject.set(x, "orderOnlineMetadata", js.undefined)
    
    inline def setPlaceActionType(value: String): Self = StObject.set(x, "placeActionType", value.asInstanceOf[js.Any])
    
    inline def setPlaceActionTypeNull: Self = StObject.set(x, "placeActionType", null)
    
    inline def setPlaceActionTypeUndefined: Self = StObject.set(x, "placeActionType", js.undefined)
    
    inline def setProviderType(value: String): Self = StObject.set(x, "providerType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeNull: Self = StObject.set(x, "providerType", null)
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "providerType", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
