package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfig extends StObject {
  
  /**
    * Required. The type of UserEvent this page optimization is shown for. Each page has an associated event type - this will be the corresponding event type for the page that the page optimization model is used on. Supported types: * `add-to-cart`: Products being added to cart. * `detail-page-view`: Products detail page viewed. * `home-page-view`: Homepage viewed * `category-page-view`: Homepage viewed * `shopping-cart-page-view`: User viewing a shopping cart. `home-page-view` only allows models with type `recommended-for-you`. All other page_optimization_event_type allow all Model.types.
    */
  var pageOptimizationEventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A list of panel configurations. Limit = 5.
    */
  var panels: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel]] = js.undefined
  
  /**
    * Optional. How to restrict results across panels e.g. can the same ServingConfig be shown on multiple panels at once. If unspecified, default to `UNIQUE_MODEL_RESTRICTION`.
    */
  var restriction: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfig](x: Self) {
    
    inline def setPageOptimizationEventType(value: String): Self = StObject.set(x, "pageOptimizationEventType", value.asInstanceOf[js.Any])
    
    inline def setPageOptimizationEventTypeNull: Self = StObject.set(x, "pageOptimizationEventType", null)
    
    inline def setPageOptimizationEventTypeUndefined: Self = StObject.set(x, "pageOptimizationEventType", js.undefined)
    
    inline def setPanels(value: js.Array[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
    
    inline def setPanelsVarargs(value: SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfigPanel*): Self = StObject.set(x, "panels", js.Array(value*))
    
    inline def setRestriction(value: String): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionNull: Self = StObject.set(x, "restriction", null)
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
  }
}
