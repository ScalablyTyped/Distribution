package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortAnswerSubmission extends StObject {
  
  /** Student response to a short-answer question. */
  var answer: js.UndefOr[String] = js.undefined
}
object ShortAnswerSubmission {
  
  inline def apply(): ShortAnswerSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortAnswerSubmission]
  }
  
  extension [Self <: ShortAnswerSubmission](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
  }
}
