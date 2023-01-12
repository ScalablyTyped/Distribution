package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChoiceMap[T /* <: Answers */] extends StObject {
  
  var Choice: typings.inquirer.libObjectsChoiceMod.default[T]
  
  var ChoiceOptions: typings.inquirer.mod.ChoiceOptions
  
  var Separator: typings.inquirer.libObjectsSeparatorMod.default
  
  var SeparatorOptions: typings.inquirer.mod.SeparatorOptions
}
object BaseChoiceMap {
  
  inline def apply[T /* <: Answers */](
    Choice: typings.inquirer.libObjectsChoiceMod.default[T],
    ChoiceOptions: ChoiceOptions,
    Separator: typings.inquirer.libObjectsSeparatorMod.default,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseChoiceMap[?], T /* <: Answers */] (val x: Self & BaseChoiceMap[T]) extends AnyVal {
    
    inline def setChoice(value: typings.inquirer.libObjectsChoiceMod.default[T]): Self = StObject.set(x, "Choice", value.asInstanceOf[js.Any])
    
    inline def setChoiceOptions(value: ChoiceOptions): Self = StObject.set(x, "ChoiceOptions", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: typings.inquirer.libObjectsSeparatorMod.default): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorOptions(value: SeparatorOptions): Self = StObject.set(x, "SeparatorOptions", value.asInstanceOf[js.Any])
  }
}
