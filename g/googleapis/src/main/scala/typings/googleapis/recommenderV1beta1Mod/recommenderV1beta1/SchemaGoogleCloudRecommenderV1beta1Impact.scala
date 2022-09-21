package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1Impact extends StObject {
  
  /**
    * Category that is being targeted.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use with CategoryType.COST
    */
  var costProjection: js.UndefOr[SchemaGoogleCloudRecommenderV1beta1CostProjection] = js.undefined
  
  /**
    * Use with CategoryType.SECURITY
    */
  var securityProjection: js.UndefOr[SchemaGoogleCloudRecommenderV1beta1SecurityProjection] = js.undefined
  
  /**
    * Use with CategoryType.SUSTAINABILITY
    */
  var sustainabilityProjection: js.UndefOr[SchemaGoogleCloudRecommenderV1beta1SustainabilityProjection] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1Impact {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1Impact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1Impact]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1Impact](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCostProjection(value: SchemaGoogleCloudRecommenderV1beta1CostProjection): Self = StObject.set(x, "costProjection", value.asInstanceOf[js.Any])
    
    inline def setCostProjectionUndefined: Self = StObject.set(x, "costProjection", js.undefined)
    
    inline def setSecurityProjection(value: SchemaGoogleCloudRecommenderV1beta1SecurityProjection): Self = StObject.set(x, "securityProjection", value.asInstanceOf[js.Any])
    
    inline def setSecurityProjectionUndefined: Self = StObject.set(x, "securityProjection", js.undefined)
    
    inline def setSustainabilityProjection(value: SchemaGoogleCloudRecommenderV1beta1SustainabilityProjection): Self = StObject.set(x, "sustainabilityProjection", value.asInstanceOf[js.Any])
    
    inline def setSustainabilityProjectionUndefined: Self = StObject.set(x, "sustainabilityProjection", js.undefined)
  }
}
