package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleChoiceSubmission extends StObject {
  
  /** Student's select choice. */
  var answer: js.UndefOr[String] = js.undefined
}
object MultipleChoiceSubmission {
  
  inline def apply(): MultipleChoiceSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleChoiceSubmission]
  }
  
  extension [Self <: MultipleChoiceSubmission](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
