package typings.inquirer.mod

import typings.inquirer.inquirerStrings.rawlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `RawListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait RawListQuestion[T /* <: Answers */]
  extends StObject
     with ListQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_RawListQuestion: rawlist
}
object RawListQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): RawListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rawlist")
    __obj.asInstanceOf[RawListQuestion[T]]
  }
  
  @scala.inline
  implicit class RawListQuestionMutableBuilder[Self <: RawListQuestion[?], T /* <: Answers */] (val x: Self & RawListQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: rawlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
