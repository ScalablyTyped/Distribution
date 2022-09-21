package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource path. `projects/x/locations/global/catalogs/default_catalog/eventStores/default_event_store`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[
    SchemaGoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest
  ] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrationsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
