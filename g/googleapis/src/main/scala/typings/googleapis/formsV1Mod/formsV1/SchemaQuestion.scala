package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuestion extends StObject {
  
  /**
    * A respondent can choose from a pre-defined set of options.
    */
  var choiceQuestion: js.UndefOr[SchemaChoiceQuestion] = js.undefined
  
  /**
    * A respondent can enter a date.
    */
  var dateQuestion: js.UndefOr[SchemaDateQuestion] = js.undefined
  
  /**
    * A respondent can upload one or more files.
    */
  var fileUploadQuestion: js.UndefOr[SchemaFileUploadQuestion] = js.undefined
  
  /**
    * Grading setup for the question.
    */
  var grading: js.UndefOr[SchemaGrading] = js.undefined
  
  /**
    * Read only. The question ID. On creation, it can be provided but the ID must not be already used in the form. If not provided, a new ID is assigned.
    */
  var questionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the question must be answered in order for a respondent to submit their response.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A row of a QuestionGroupItem.
    */
  var rowQuestion: js.UndefOr[SchemaRowQuestion] = js.undefined
  
  /**
    * A respondent can choose a number from a range.
    */
  var scaleQuestion: js.UndefOr[SchemaScaleQuestion] = js.undefined
  
  /**
    * A respondent can enter a free text response.
    */
  var textQuestion: js.UndefOr[SchemaTextQuestion] = js.undefined
  
  /**
    * A respondent can enter a time.
    */
  var timeQuestion: js.UndefOr[SchemaTimeQuestion] = js.undefined
}
object SchemaQuestion {
  
  inline def apply(): SchemaQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestion]
  }
  
  extension [Self <: SchemaQuestion](x: Self) {
    
    inline def setChoiceQuestion(value: SchemaChoiceQuestion): Self = StObject.set(x, "choiceQuestion", value.asInstanceOf[js.Any])
    
    inline def setChoiceQuestionUndefined: Self = StObject.set(x, "choiceQuestion", js.undefined)
    
    inline def setDateQuestion(value: SchemaDateQuestion): Self = StObject.set(x, "dateQuestion", value.asInstanceOf[js.Any])
    
    inline def setDateQuestionUndefined: Self = StObject.set(x, "dateQuestion", js.undefined)
    
    inline def setFileUploadQuestion(value: SchemaFileUploadQuestion): Self = StObject.set(x, "fileUploadQuestion", value.asInstanceOf[js.Any])
    
    inline def setFileUploadQuestionUndefined: Self = StObject.set(x, "fileUploadQuestion", js.undefined)
    
    inline def setGrading(value: SchemaGrading): Self = StObject.set(x, "grading", value.asInstanceOf[js.Any])
    
    inline def setGradingUndefined: Self = StObject.set(x, "grading", js.undefined)
    
    inline def setQuestionId(value: String): Self = StObject.set(x, "questionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdNull: Self = StObject.set(x, "questionId", null)
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "questionId", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRowQuestion(value: SchemaRowQuestion): Self = StObject.set(x, "rowQuestion", value.asInstanceOf[js.Any])
    
    inline def setRowQuestionUndefined: Self = StObject.set(x, "rowQuestion", js.undefined)
    
    inline def setScaleQuestion(value: SchemaScaleQuestion): Self = StObject.set(x, "scaleQuestion", value.asInstanceOf[js.Any])
    
    inline def setScaleQuestionUndefined: Self = StObject.set(x, "scaleQuestion", js.undefined)
    
    inline def setTextQuestion(value: SchemaTextQuestion): Self = StObject.set(x, "textQuestion", value.asInstanceOf[js.Any])
    
    inline def setTextQuestionUndefined: Self = StObject.set(x, "textQuestion", js.undefined)
    
    inline def setTimeQuestion(value: SchemaTimeQuestion): Self = StObject.set(x, "timeQuestion", value.asInstanceOf[js.Any])
    
    inline def setTimeQuestionUndefined: Self = StObject.set(x, "timeQuestion", js.undefined)
  }
}
