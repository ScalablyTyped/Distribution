package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategory extends StObject {
  
  /**
    * The identifier of the category.
    */
  var categoryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The localized name of the category.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaCategory {
  
  inline def apply(): SchemaCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategory]
  }
  
  extension [Self <: SchemaCategory](x: Self) {
    
    inline def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdNull: Self = StObject.set(x, "categoryId", null)
    
    inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
