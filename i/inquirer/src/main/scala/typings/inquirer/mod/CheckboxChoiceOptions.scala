package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for a choice of the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxChoiceOptions[T /* <: Answers */] extends ListChoiceOptions[T] {
  
  /**
    * A value indicating whether the choice should be initially checked.
    */
  var checked: js.UndefOr[Boolean] = js.native
}
object CheckboxChoiceOptions {
  
  @scala.inline
  def apply[T /* <: Answers */](): CheckboxChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxChoiceOptions[T]]
  }
  
  @scala.inline
  implicit class CheckboxChoiceOptionsMutableBuilder[Self <: CheckboxChoiceOptions[_], T /* <: Answers */] (val x: Self with CheckboxChoiceOptions[T]) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
  }
}
