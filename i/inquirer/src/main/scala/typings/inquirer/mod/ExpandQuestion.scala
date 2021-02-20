package typings.inquirer.mod

import typings.inquirer.inquirerStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `ExpandPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ExpandQuestion[T /* <: Answers */] extends ListQuestionOptionsBase[T, ExpandChoiceMap[T]] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ExpandQuestion: expand = js.native
}
object ExpandQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: expand): ExpandQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandQuestion[T]]
  }
  
  @scala.inline
  implicit class ExpandQuestionMutableBuilder[Self <: ExpandQuestion[_], T /* <: Answers */] (val x: Self with ExpandQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: expand): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
