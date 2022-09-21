package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersLocationsRecommendersRecommendationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the recommendation.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersLocationsRecommendersRecommendationsGet {
  
  inline def apply(): ParamsResourceFoldersLocationsRecommendersRecommendationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersLocationsRecommendersRecommendationsGet]
  }
  
  extension [Self <: ParamsResourceFoldersLocationsRecommendersRecommendationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
