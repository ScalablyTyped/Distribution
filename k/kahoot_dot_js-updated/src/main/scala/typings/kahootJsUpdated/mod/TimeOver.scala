package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOver extends StObject {
  
  var questionNumber: Double
}
object TimeOver {
  
  inline def apply(questionNumber: Double): TimeOver = {
    val __obj = js.Dynamic.literal(questionNumber = questionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOver]
  }
  
  extension [Self <: TimeOver](x: Self) {
    
    inline def setQuestionNumber(value: Double): Self = StObject.set(x, "questionNumber", value.asInstanceOf[js.Any])
  }
}
