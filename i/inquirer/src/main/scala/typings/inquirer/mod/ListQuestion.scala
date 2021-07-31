package typings.inquirer.mod

import typings.inquirer.inquirerStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `ListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait ListQuestion[T /* <: Answers */]
  extends StObject
     with ListQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ListQuestion: list
}
object ListQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): ListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[ListQuestion[T]]
  }
  
  @scala.inline
  implicit class ListQuestionMutableBuilder[Self <: ListQuestion[?], T /* <: Answers */] (val x: Self & ListQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
