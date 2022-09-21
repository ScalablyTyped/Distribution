package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuestionGroupItem extends StObject {
  
  /**
    * The question group is a grid with rows of multiple choice questions that share the same options. When `grid` is set, all questions in the group must be of kind `row`.
    */
  var grid: js.UndefOr[SchemaGrid] = js.undefined
  
  /**
    * The image displayed within the question group above the specific questions.
    */
  var image: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * Required. A list of questions that belong in this question group. A question must only belong to one group. The `kind` of the group may affect what types of questions are allowed.
    */
  var questions: js.UndefOr[js.Array[SchemaQuestion]] = js.undefined
}
object SchemaQuestionGroupItem {
  
  inline def apply(): SchemaQuestionGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestionGroupItem]
  }
  
  extension [Self <: SchemaQuestionGroupItem](x: Self) {
    
    inline def setGrid(value: SchemaGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setImage(value: SchemaImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setQuestions(value: js.Array[SchemaQuestion]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
    
    inline def setQuestionsUndefined: Self = StObject.set(x, "questions", js.undefined)
    
    inline def setQuestionsVarargs(value: SchemaQuestion*): Self = StObject.set(x, "questions", js.Array(value*))
  }
}
