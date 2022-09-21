package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRecommendersUpdateconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Name of recommender config. Eg, projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRecommenderV1RecommenderConfig] = js.undefined
  
  /**
    * The list of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * If true, validate the request and preview the change, but do not actually update it.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsLocationsRecommendersUpdateconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsRecommendersUpdateconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRecommendersUpdateconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRecommendersUpdateconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRecommenderV1RecommenderConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
