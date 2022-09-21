package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChoiceMap[T /* <: Answers */] extends StObject {
  
  var Choice: typings.inquirer.choiceMod.default[T]
  
  var ChoiceOptions: typings.inquirer.mod.ChoiceOptions
  
  var Separator: typings.inquirer.separatorMod.default
  
  var SeparatorOptions: typings.inquirer.mod.SeparatorOptions
}
object BaseChoiceMap {
  
  inline def apply[T /* <: Answers */](
    Choice: typings.inquirer.choiceMod.default[T],
    ChoiceOptions: ChoiceOptions,
    Separator: typings.inquirer.separatorMod.default,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
  
  extension [Self <: BaseChoiceMap[?], T /* <: Answers */](x: Self & BaseChoiceMap[T]) {
    
    inline def setChoice(value: typings.inquirer.choiceMod.default[T]): Self = StObject.set(x, "Choice", value.asInstanceOf[js.Any])
    
    inline def setChoiceOptions(value: ChoiceOptions): Self = StObject.set(x, "ChoiceOptions", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: typings.inquirer.separatorMod.default): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorOptions(value: SeparatorOptions): Self = StObject.set(x, "SeparatorOptions", value.asInstanceOf[js.Any])
  }
}
