package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivityContentDetailsRecommendation extends StObject {
  
  /**
    * The reason that the resource is recommended to the user.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resourceId object contains information that identifies the recommended resource.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
  
  /**
    * The seedResourceId object contains information about the resource that caused the recommendation.
    */
  var seedResourceId: js.UndefOr[SchemaResourceId] = js.undefined
}
object SchemaActivityContentDetailsRecommendation {
  
  inline def apply(): SchemaActivityContentDetailsRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsRecommendation]
  }
  
  extension [Self <: SchemaActivityContentDetailsRecommendation](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSeedResourceId(value: SchemaResourceId): Self = StObject.set(x, "seedResourceId", value.asInstanceOf[js.Any])
    
    inline def setSeedResourceIdUndefined: Self = StObject.set(x, "seedResourceId", js.undefined)
  }
}
