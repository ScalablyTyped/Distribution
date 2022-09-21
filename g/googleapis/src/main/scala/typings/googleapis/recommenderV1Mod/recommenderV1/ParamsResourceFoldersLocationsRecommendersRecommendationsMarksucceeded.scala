package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersLocationsRecommendersRecommendationsMarksucceeded
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the recommendation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRecommenderV1MarkRecommendationSucceededRequest] = js.undefined
}
object ParamsResourceFoldersLocationsRecommendersRecommendationsMarksucceeded {
  
  inline def apply(): ParamsResourceFoldersLocationsRecommendersRecommendationsMarksucceeded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersLocationsRecommendersRecommendationsMarksucceeded]
  }
  
  extension [Self <: ParamsResourceFoldersLocationsRecommendersRecommendationsMarksucceeded](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRecommenderV1MarkRecommendationSucceededRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
