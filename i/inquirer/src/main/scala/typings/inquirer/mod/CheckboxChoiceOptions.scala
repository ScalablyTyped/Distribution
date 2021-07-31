package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a choice of the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait CheckboxChoiceOptions[T /* <: Answers */]
  extends StObject
     with ListChoiceOptions[T] {
  
  /**
    * A value indicating whether the choice should be initially checked.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
}
object CheckboxChoiceOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): CheckboxChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxChoiceOptions[T]]
  }
  
  @scala.inline
  implicit class CheckboxChoiceOptionsMutableBuilder[Self <: CheckboxChoiceOptions[?], T /* <: Answers */] (val x: Self & CheckboxChoiceOptions[T]) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
