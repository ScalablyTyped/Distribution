package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateItemResponse extends StObject {
  
  /**
    * The ID of the created item.
    */
  var itemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the question created as part of this item, for a question group it lists IDs of all the questions created for this item.
    */
  var questionId: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCreateItemResponse {
  
  inline def apply(): SchemaCreateItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateItemResponse]
  }
  
  extension [Self <: SchemaCreateItemResponse](x: Self) {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setQuestionId(value: js.Array[String]): Self = StObject.set(x, "questionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdNull: Self = StObject.set(x, "questionId", null)
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "questionId", js.undefined)
    
    inline def setQuestionIdVarargs(value: String*): Self = StObject.set(x, "questionId", js.Array(value*))
  }
}
