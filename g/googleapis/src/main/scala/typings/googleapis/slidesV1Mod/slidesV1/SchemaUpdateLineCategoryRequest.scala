package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateLineCategoryRequest extends StObject {
  
  /**
    * The line category to update to. The exact line type is determined based on the category to update to and how it's routed to connect to other page elements.
    */
  var lineCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The object ID of the line the update is applied to. Only a line with a category indicating it is a "connector" can be updated. The line may be rerouted after updating its category.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateLineCategoryRequest {
  
  inline def apply(): SchemaUpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateLineCategoryRequest]
  }
  
  extension [Self <: SchemaUpdateLineCategoryRequest](x: Self) {
    
    inline def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
    
    inline def setLineCategoryNull: Self = StObject.set(x, "lineCategory", null)
    
    inline def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
