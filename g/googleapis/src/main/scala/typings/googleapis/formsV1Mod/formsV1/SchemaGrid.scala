package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrid extends StObject {
  
  /**
    * Required. The choices shared by each question in the grid. In other words, the values of the columns. Only `CHECK_BOX` and `RADIO` choices are allowed.
    */
  var columns: js.UndefOr[SchemaChoiceQuestion] = js.undefined
  
  /**
    * If `true`, the questions are randomly ordered. In other words, the rows appear in a different order for every respondent.
    */
  var shuffleQuestions: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGrid {
  
  inline def apply(): SchemaGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrid]
  }
  
  extension [Self <: SchemaGrid](x: Self) {
    
    inline def setColumns(value: SchemaChoiceQuestion): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setShuffleQuestions(value: Boolean): Self = StObject.set(x, "shuffleQuestions", value.asInstanceOf[js.Any])
    
    inline def setShuffleQuestionsNull: Self = StObject.set(x, "shuffleQuestions", null)
    
    inline def setShuffleQuestionsUndefined: Self = StObject.set(x, "shuffleQuestions", js.undefined)
  }
}
