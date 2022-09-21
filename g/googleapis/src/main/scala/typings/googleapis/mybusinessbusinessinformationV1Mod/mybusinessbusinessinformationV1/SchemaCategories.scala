package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategories extends StObject {
  
  /**
    * Optional. Additional categories to describe your business. Categories help your customers find accurate, specific results for services they're interested in. To keep your business information accurate and live, make sure that you use as few categories as possible to describe your overall core business. Choose categories that are as specific as possible, but representative of your main business.
    */
  var additionalCategories: js.UndefOr[js.Array[SchemaCategory]] = js.undefined
  
  /**
    * Required. Category that best describes the core business this location engages in.
    */
  var primaryCategory: js.UndefOr[SchemaCategory] = js.undefined
}
object SchemaCategories {
  
  inline def apply(): SchemaCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategories]
  }
  
  extension [Self <: SchemaCategories](x: Self) {
    
    inline def setAdditionalCategories(value: js.Array[SchemaCategory]): Self = StObject.set(x, "additionalCategories", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCategoriesUndefined: Self = StObject.set(x, "additionalCategories", js.undefined)
    
    inline def setAdditionalCategoriesVarargs(value: SchemaCategory*): Self = StObject.set(x, "additionalCategories", js.Array(value*))
    
    inline def setPrimaryCategory(value: SchemaCategory): Self = StObject.set(x, "primaryCategory", value.asInstanceOf[js.Any])
    
    inline def setPrimaryCategoryUndefined: Self = StObject.set(x, "primaryCategory", js.undefined)
  }
}
