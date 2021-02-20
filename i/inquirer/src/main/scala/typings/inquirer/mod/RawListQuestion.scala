package typings.inquirer.mod

import typings.inquirer.inquirerStrings.rawlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `RawListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait RawListQuestion[T /* <: Answers */] extends ListQuestionOptions[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_RawListQuestion: rawlist = js.native
}
object RawListQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: rawlist): RawListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawListQuestion[T]]
  }
  
  @scala.inline
  implicit class RawListQuestionMutableBuilder[Self <: RawListQuestion[_], T /* <: Answers */] (val x: Self with RawListQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: rawlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
