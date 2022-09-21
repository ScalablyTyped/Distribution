package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleChoiceQuestion extends StObject {
  
  /** Possible choices. */
  var choices: js.UndefOr[js.Array[String]] = js.undefined
}
object MultipleChoiceQuestion {
  
  inline def apply(): MultipleChoiceQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleChoiceQuestion]
  }
  
  extension [Self <: MultipleChoiceQuestion](x: Self) {
    
    inline def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value*))
  }
}
