package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1Impact extends StObject {
  
  /**
    * Category that is being targeted.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Use with CategoryType.COST
    */
  var costProjection: js.UndefOr[SchemaGoogleCloudRecommenderV1CostProjection] = js.undefined
  
  /**
    * Use with CategoryType.SECURITY
    */
  var securityProjection: js.UndefOr[SchemaGoogleCloudRecommenderV1SecurityProjection] = js.undefined
}
object SchemaGoogleCloudRecommenderV1Impact {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1Impact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1Impact]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1Impact](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCostProjection(value: SchemaGoogleCloudRecommenderV1CostProjection): Self = StObject.set(x, "costProjection", value.asInstanceOf[js.Any])
    
    inline def setCostProjectionUndefined: Self = StObject.set(x, "costProjection", js.undefined)
    
    inline def setSecurityProjection(value: SchemaGoogleCloudRecommenderV1SecurityProjection): Self = StObject.set(x, "securityProjection", value.asInstanceOf[js.Any])
    
    inline def setSecurityProjectionUndefined: Self = StObject.set(x, "securityProjection", js.undefined)
  }
}
