package typings.inquirer.mod

import typings.inquirer.inquirerStrings.editor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a question for the `EditorPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait EditorQuestion[T /* <: Answers */]
  extends StObject
     with Question[T] {
  
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_EditorQuestion: editor
}
object EditorQuestion {
  
  @scala.inline
  def apply[T /* <: Answers */](): EditorQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("editor")
    __obj.asInstanceOf[EditorQuestion[T]]
  }
  
  @scala.inline
  implicit class EditorQuestionMutableBuilder[Self <: EditorQuestion[?], T /* <: Answers */] (val x: Self & EditorQuestion[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: editor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
