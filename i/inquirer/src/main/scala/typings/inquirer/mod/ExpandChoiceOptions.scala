package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a choice of the `ExpandPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait ExpandChoiceOptions[T /* <: Answers */]
  extends StObject
     with ChoiceOptions[T] {
  
  /**
    * The key to press for selecting the choice.
    */
  var key: js.UndefOr[String] = js.undefined
}
object ExpandChoiceOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): ExpandChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandChoiceOptions[T]]
  }
  
  @scala.inline
  implicit class ExpandChoiceOptionsMutableBuilder[Self <: ExpandChoiceOptions[?], T /* <: Answers */] (val x: Self & ExpandChoiceOptions[T]) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
