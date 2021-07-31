package typings.inquirer.mod

import typings.inquirer.anon.IsFinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `InputPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait InputQuestionOptions[T /* <: Answers */]
  extends StObject
     with Question[T] {
  
  /**
    * Transforms the value to display to the user.
    *
    * @param input
    * The input provided by the user.
    *
    * @param answers
    * The answers provided by the users.
    *
    * @param flags
    * Additional information about the value.
    *
    * @returns
    * The value to display to the user.
    */
  var transformer: js.UndefOr[
    js.Function3[/* input */ js.Any, /* answers */ T, /* flags */ IsFinal, String | js.Promise[String]]
  ] = js.undefined
}
object InputQuestionOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): InputQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuestionOptions[T]]
  }
  
  @scala.inline
  implicit class InputQuestionOptionsMutableBuilder[Self <: InputQuestionOptions[?], T /* <: Answers */] (val x: Self & InputQuestionOptions[T]) extends AnyVal {
    
    @scala.inline
    def setTransformer(value: (/* input */ js.Any, /* answers */ T, /* flags */ IsFinal) => String | js.Promise[String]): Self = StObject.set(x, "transformer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
  }
}
