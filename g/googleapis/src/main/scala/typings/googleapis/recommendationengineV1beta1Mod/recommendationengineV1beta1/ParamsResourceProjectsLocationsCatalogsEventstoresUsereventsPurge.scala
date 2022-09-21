package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the event_store under which the events are created. The format is `projects/${projectId\}/locations/global/catalogs/${catalogId\}/eventStores/${eventStoreId\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge {
  
  inline def apply(): ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsCatalogsEventstoresUsereventsPurge](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
