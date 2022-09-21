package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFormResponse extends StObject {
  
  /**
    * Output only. The actual answers to the questions, keyed by question_id.
    */
  var answers: js.UndefOr[StringDictionary[SchemaAnswer] | Null] = js.undefined
  
  /**
    * Output only. Timestamp for the first time the response was submitted.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The form ID.
    */
  var formId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp for the most recent time the response was submitted. Does not track changes to grades.
    */
  var lastSubmittedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The email address (if collected) for the respondent.
    */
  var respondentEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The response ID.
    */
  var responseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The total number of points the respondent received for their submission Only set if the form was a quiz and the response was graded. This includes points automatically awarded via autograding adjusted by any manual corrections entered by the form owner.
    */
  var totalScore: js.UndefOr[Double | Null] = js.undefined
}
object SchemaFormResponse {
  
  inline def apply(): SchemaFormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormResponse]
  }
  
  extension [Self <: SchemaFormResponse](x: Self) {
    
    inline def setAnswers(value: StringDictionary[SchemaAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersNull: Self = StObject.set(x, "answers", null)
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdNull: Self = StObject.set(x, "formId", null)
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setLastSubmittedTime(value: String): Self = StObject.set(x, "lastSubmittedTime", value.asInstanceOf[js.Any])
    
    inline def setLastSubmittedTimeNull: Self = StObject.set(x, "lastSubmittedTime", null)
    
    inline def setLastSubmittedTimeUndefined: Self = StObject.set(x, "lastSubmittedTime", js.undefined)
    
    inline def setRespondentEmail(value: String): Self = StObject.set(x, "respondentEmail", value.asInstanceOf[js.Any])
    
    inline def setRespondentEmailNull: Self = StObject.set(x, "respondentEmail", null)
    
    inline def setRespondentEmailUndefined: Self = StObject.set(x, "respondentEmail", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setTotalScore(value: Double): Self = StObject.set(x, "totalScore", value.asInstanceOf[js.Any])
    
    inline def setTotalScoreNull: Self = StObject.set(x, "totalScore", null)
    
    inline def setTotalScoreUndefined: Self = StObject.set(x, "totalScore", js.undefined)
  }
}
