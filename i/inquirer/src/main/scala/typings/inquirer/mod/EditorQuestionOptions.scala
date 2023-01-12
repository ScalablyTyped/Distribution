package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorQuestionOptions[T /* <: Answers */]
  extends StObject
     with Question[T] {
  
  /**
    * The postfix of the file being edited.
    *
    * Adding this will add color highlighting to the file content in most editors.
    */
  var postfix: js.UndefOr[String] = js.undefined
}
object EditorQuestionOptions {
  
  inline def apply[T /* <: Answers */](): EditorQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorQuestionOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorQuestionOptions[?], T /* <: Answers */] (val x: Self & EditorQuestionOptions[T]) extends AnyVal {
    
    inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
    
    inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
  }
}
