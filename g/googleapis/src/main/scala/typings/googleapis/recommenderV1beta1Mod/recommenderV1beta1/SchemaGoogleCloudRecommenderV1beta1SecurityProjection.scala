package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1SecurityProjection extends StObject {
  
  /**
    * This field can be used by the recommender to define details specific to security impact.
    */
  var details: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1SecurityProjection {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1SecurityProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1SecurityProjection]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1SecurityProjection](x: Self) {
    
    inline def setDetails(value: StringDictionary[Any]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
