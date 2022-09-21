package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleVerifyBrandSafetyCategories extends StObject {
  
  /**
    * Unknown or unrateable.
    */
  var avoidUnknownBrandSafetyCategory: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Brand safety high severity avoidance categories.
    */
  var avoidedHighSeverityCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Brand safety medium severity avoidance categories.
    */
  var avoidedMediumSeverityCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaDoubleVerifyBrandSafetyCategories {
  
  inline def apply(): SchemaDoubleVerifyBrandSafetyCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleVerifyBrandSafetyCategories]
  }
  
  extension [Self <: SchemaDoubleVerifyBrandSafetyCategories](x: Self) {
    
    inline def setAvoidUnknownBrandSafetyCategory(value: Boolean): Self = StObject.set(x, "avoidUnknownBrandSafetyCategory", value.asInstanceOf[js.Any])
    
    inline def setAvoidUnknownBrandSafetyCategoryNull: Self = StObject.set(x, "avoidUnknownBrandSafetyCategory", null)
    
    inline def setAvoidUnknownBrandSafetyCategoryUndefined: Self = StObject.set(x, "avoidUnknownBrandSafetyCategory", js.undefined)
    
    inline def setAvoidedHighSeverityCategories(value: js.Array[String]): Self = StObject.set(x, "avoidedHighSeverityCategories", value.asInstanceOf[js.Any])
    
    inline def setAvoidedHighSeverityCategoriesNull: Self = StObject.set(x, "avoidedHighSeverityCategories", null)
    
    inline def setAvoidedHighSeverityCategoriesUndefined: Self = StObject.set(x, "avoidedHighSeverityCategories", js.undefined)
    
    inline def setAvoidedHighSeverityCategoriesVarargs(value: String*): Self = StObject.set(x, "avoidedHighSeverityCategories", js.Array(value*))
    
    inline def setAvoidedMediumSeverityCategories(value: js.Array[String]): Self = StObject.set(x, "avoidedMediumSeverityCategories", value.asInstanceOf[js.Any])
    
    inline def setAvoidedMediumSeverityCategoriesNull: Self = StObject.set(x, "avoidedMediumSeverityCategories", null)
    
    inline def setAvoidedMediumSeverityCategoriesUndefined: Self = StObject.set(x, "avoidedMediumSeverityCategories", js.undefined)
    
    inline def setAvoidedMediumSeverityCategoriesVarargs(value: String*): Self = StObject.set(x, "avoidedMediumSeverityCategories", js.Array(value*))
  }
}
