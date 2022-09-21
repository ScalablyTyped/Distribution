package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdloox extends StObject {
  
  /**
    * Adloox's brand safety settings.
    */
  var excludedAdlooxCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAdloox {
  
  inline def apply(): SchemaAdloox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdloox]
  }
  
  extension [Self <: SchemaAdloox](x: Self) {
    
    inline def setExcludedAdlooxCategories(value: js.Array[String]): Self = StObject.set(x, "excludedAdlooxCategories", value.asInstanceOf[js.Any])
    
    inline def setExcludedAdlooxCategoriesNull: Self = StObject.set(x, "excludedAdlooxCategories", null)
    
    inline def setExcludedAdlooxCategoriesUndefined: Self = StObject.set(x, "excludedAdlooxCategories", js.undefined)
    
    inline def setExcludedAdlooxCategoriesVarargs(value: String*): Self = StObject.set(x, "excludedAdlooxCategories", js.Array(value*))
  }
}
