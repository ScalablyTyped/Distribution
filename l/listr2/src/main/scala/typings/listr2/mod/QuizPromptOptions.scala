package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuizPromptOptions
  extends StObject
     with ArrayPromptOptions {
  
  var correctChoice: Double
}
object QuizPromptOptions {
  
  inline def apply(
    choices: js.Array[BasePromptOptionsWithName | String],
    correctChoice: Double,
    message: String | (js.Function0[js.Promise[String] | String])
  ): QuizPromptOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], correctChoice = correctChoice.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuizPromptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuizPromptOptions] (val x: Self) extends AnyVal {
    
    inline def setCorrectChoice(value: Double): Self = StObject.set(x, "correctChoice", value.asInstanceOf[js.Any])
  }
}
