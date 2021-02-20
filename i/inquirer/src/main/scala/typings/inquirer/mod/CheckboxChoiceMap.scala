package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types for the `CheckboxQuestion`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  
  var CheckboxChoiceOptions: typings.inquirer.mod.CheckboxChoiceOptions[T] = js.native
}
object CheckboxChoiceMap {
  
  @scala.inline
  def apply[T /* <: Answers */](
    CheckboxChoiceOptions: CheckboxChoiceOptions[T],
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): CheckboxChoiceMap[T] = {
    val __obj = js.Dynamic.literal(CheckboxChoiceOptions = CheckboxChoiceOptions.asInstanceOf[js.Any], Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxChoiceMap[T]]
  }
  
  @scala.inline
  implicit class CheckboxChoiceMapMutableBuilder[Self <: CheckboxChoiceMap[_], T /* <: Answers */] (val x: Self with CheckboxChoiceMap[T]) extends AnyVal {
    
    @scala.inline
    def setCheckboxChoiceOptions(value: CheckboxChoiceOptions[T]): Self = StObject.set(x, "CheckboxChoiceOptions", value.asInstanceOf[js.Any])
  }
}
