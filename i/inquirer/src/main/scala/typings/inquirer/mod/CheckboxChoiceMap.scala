package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxChoiceMap[T /* <: Answers */]
  extends StObject
     with BaseChoiceMap[T] {
  
  var CheckboxChoiceOptions: typings.inquirer.mod.CheckboxChoiceOptions[T]
}
object CheckboxChoiceMap {
  
  inline def apply[T /* <: Answers */](
    CheckboxChoiceOptions: CheckboxChoiceOptions[T],
    Choice: typings.inquirer.libObjectsChoiceMod.default[T],
    ChoiceOptions: ChoiceOptions,
    Separator: typings.inquirer.libObjectsSeparatorMod.default,
    SeparatorOptions: SeparatorOptions
  ): CheckboxChoiceMap[T] = {
    val __obj = js.Dynamic.literal(CheckboxChoiceOptions = CheckboxChoiceOptions.asInstanceOf[js.Any], Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxChoiceMap[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckboxChoiceMap[?], T /* <: Answers */] (val x: Self & CheckboxChoiceMap[T]) extends AnyVal {
    
    inline def setCheckboxChoiceOptions(value: CheckboxChoiceOptions[T]): Self = StObject.set(x, "CheckboxChoiceOptions", value.asInstanceOf[js.Any])
  }
}
