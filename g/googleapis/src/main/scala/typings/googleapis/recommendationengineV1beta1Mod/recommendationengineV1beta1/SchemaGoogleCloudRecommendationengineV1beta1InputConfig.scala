package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1InputConfig extends StObject {
  
  /**
    * BigQuery input source.
    */
  var bigQuerySource: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1BigQuerySource] = js.undefined
  
  /**
    * The Inline source for the input content for Catalog items.
    */
  var catalogInlineSource: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1CatalogInlineSource] = js.undefined
  
  /**
    * Google Cloud Storage location for the input content.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1GcsSource] = js.undefined
  
  /**
    * The Inline source for the input content for UserEvents.
    */
  var userEventInlineSource: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1UserEventInlineSource] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1InputConfig {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1InputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1InputConfig](x: Self) {
    
    inline def setBigQuerySource(value: SchemaGoogleCloudRecommendationengineV1beta1BigQuerySource): Self = StObject.set(x, "bigQuerySource", value.asInstanceOf[js.Any])
    
    inline def setBigQuerySourceUndefined: Self = StObject.set(x, "bigQuerySource", js.undefined)
    
    inline def setCatalogInlineSource(value: SchemaGoogleCloudRecommendationengineV1beta1CatalogInlineSource): Self = StObject.set(x, "catalogInlineSource", value.asInstanceOf[js.Any])
    
    inline def setCatalogInlineSourceUndefined: Self = StObject.set(x, "catalogInlineSource", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudRecommendationengineV1beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setUserEventInlineSource(value: SchemaGoogleCloudRecommendationengineV1beta1UserEventInlineSource): Self = StObject.set(x, "userEventInlineSource", value.asInstanceOf[js.Any])
    
    inline def setUserEventInlineSourceUndefined: Self = StObject.set(x, "userEventInlineSource", js.undefined)
  }
}
