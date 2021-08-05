package typings.googleapis.languageV1beta2Mod.languageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The document classification response message.
  */
trait SchemaClassifyTextResponse extends StObject {
  
  /**
    * Categories representing the input document.
    */
  var categories: js.UndefOr[js.Array[SchemaClassificationCategory]] = js.undefined
}
object SchemaClassifyTextResponse {
  
  inline def apply(): SchemaClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClassifyTextResponse]
  }
  
  extension [Self <: SchemaClassifyTextResponse](x: Self) {
    
    inline def setCategories(value: js.Array[SchemaClassificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: SchemaClassificationCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
