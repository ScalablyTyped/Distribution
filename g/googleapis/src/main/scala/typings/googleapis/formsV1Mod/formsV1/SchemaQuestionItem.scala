package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuestionItem extends StObject {
  
  /**
    * The image displayed within the question.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * Required. The displayed question.
    */
  var question: js.UndefOr[SchemaQuestion] = js.undefined
}
object SchemaQuestionItem {
  
  inline def apply(): SchemaQuestionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestionItem]
  }
  
  extension [Self <: SchemaQuestionItem](x: Self) {
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setQuestion(value: SchemaQuestion): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
  }
}
