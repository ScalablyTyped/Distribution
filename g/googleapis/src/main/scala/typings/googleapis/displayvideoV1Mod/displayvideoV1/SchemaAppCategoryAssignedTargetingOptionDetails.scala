package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppCategoryAssignedTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of the app category.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if this option is being negatively targeted.
    */
  var negative: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The targeting_option_id field when targeting_type is `TARGETING_TYPE_APP_CATEGORY`.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppCategoryAssignedTargetingOptionDetails {
  
  inline def apply(): SchemaAppCategoryAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppCategoryAssignedTargetingOptionDetails]
  }
  
  extension [Self <: SchemaAppCategoryAssignedTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeNull: Self = StObject.set(x, "negative", null)
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
