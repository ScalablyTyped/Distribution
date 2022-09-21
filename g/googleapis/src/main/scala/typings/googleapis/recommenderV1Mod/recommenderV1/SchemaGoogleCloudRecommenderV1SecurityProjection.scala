package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1SecurityProjection extends StObject {
  
  /**
    * Additional security impact details that is provided by the recommender.
    */
  var details: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1SecurityProjection {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1SecurityProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1SecurityProjection]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1SecurityProjection](x: Self) {
    
    inline def setDetails(value: StringDictionary[Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
