package typings.inquirer.mod

import typings.inquirer.inquirerStrings.editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `EditorPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait EditorQuestion[T /* <: Answers */] extends Question[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_EditorQuestion: editor = js.native
}
object EditorQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](`type`: editor): EditorQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorQuestion[T]]
  }
  
  @scala.inline
  implicit class EditorQuestionMutableBuilder[Self <: EditorQuestion[_], T /* <: Answers */] (val x: Self with EditorQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: editor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
