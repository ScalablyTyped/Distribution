package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2InfoTypeCategory extends StObject {
  
  /**
    * The group of relevant businesses where this infoType is commonly used
    */
  var industryCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The region or country that issued the ID or document represented by the infoType.
    */
  var locationCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The class of identifiers where this infoType belongs
    */
  var typeCategory: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2InfoTypeCategory {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InfoTypeCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeCategory]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InfoTypeCategory](x: Self) {
    
    inline def setIndustryCategory(value: String): Self = StObject.set(x, "industryCategory", value.asInstanceOf[js.Any])
    
    inline def setIndustryCategoryNull: Self = StObject.set(x, "industryCategory", null)
    
    inline def setIndustryCategoryUndefined: Self = StObject.set(x, "industryCategory", js.undefined)
    
    inline def setLocationCategory(value: String): Self = StObject.set(x, "locationCategory", value.asInstanceOf[js.Any])
    
    inline def setLocationCategoryNull: Self = StObject.set(x, "locationCategory", null)
    
    inline def setLocationCategoryUndefined: Self = StObject.set(x, "locationCategory", js.undefined)
    
    inline def setTypeCategory(value: String): Self = StObject.set(x, "typeCategory", value.asInstanceOf[js.Any])
    
    inline def setTypeCategoryNull: Self = StObject.set(x, "typeCategory", null)
    
    inline def setTypeCategoryUndefined: Self = StObject.set(x, "typeCategory", js.undefined)
  }
}
