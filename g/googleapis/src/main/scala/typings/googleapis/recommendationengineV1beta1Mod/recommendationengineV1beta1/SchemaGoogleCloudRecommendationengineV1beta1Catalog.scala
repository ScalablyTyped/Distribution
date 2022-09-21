package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1Catalog extends StObject {
  
  /**
    * Required. The catalog item level configuration.
    */
  var catalogItemLevelConfig: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig] = js.undefined
  
  /**
    * Required. The ID of the default event store.
    */
  var defaultEventStoreId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The catalog display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fully qualified resource name of the catalog.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1Catalog {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1Catalog]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1Catalog](x: Self) {
    
    inline def setCatalogItemLevelConfig(value: SchemaGoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig): Self = StObject.set(x, "catalogItemLevelConfig", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemLevelConfigUndefined: Self = StObject.set(x, "catalogItemLevelConfig", js.undefined)
    
    inline def setDefaultEventStoreId(value: String): Self = StObject.set(x, "defaultEventStoreId", value.asInstanceOf[js.Any])
    
    inline def setDefaultEventStoreIdNull: Self = StObject.set(x, "defaultEventStoreId", null)
    
    inline def setDefaultEventStoreIdUndefined: Self = StObject.set(x, "defaultEventStoreId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
