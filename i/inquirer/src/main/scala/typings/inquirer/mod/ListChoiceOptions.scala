package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a choice of the `ListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait ListChoiceOptions[T /* <: Answers */]
  extends StObject
     with ChoiceOptions[T] {
  
  /**
    * A value indicating whether the choice is disabled.
    */
  var disabled: js.UndefOr[DynamicQuestionProperty[Boolean | String, T]] = js.undefined
}
object ListChoiceOptions {
  
  inline def apply[T /* <: Answers */](): ListChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChoiceOptions[T]]
  }
  
  extension [Self <: ListChoiceOptions[?], T /* <: Answers */](x: Self & ListChoiceOptions[T]) {
    
    inline def setDisabled(value: DynamicQuestionProperty[Boolean | String, T]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: T => Boolean | String): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
