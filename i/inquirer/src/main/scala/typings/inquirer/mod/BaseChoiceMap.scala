package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types for any kind of question.
  *
  * @template T
  * The type of the answers.
  */
trait BaseChoiceMap[T /* <: Answers */] extends StObject {
  
  var Choice: typings.inquirer.choiceMod.^[T]
  
  var ChoiceOptions: typings.inquirer.mod.ChoiceOptions[T]
  
  var Separator: typings.inquirer.separatorMod.^
  
  var SeparatorOptions: typings.inquirer.mod.SeparatorOptions
}
object BaseChoiceMap {
  
  inline def apply[T /* <: Answers */](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
  
  extension [Self <: BaseChoiceMap[?], T /* <: Answers */](x: Self & BaseChoiceMap[T]) {
    
    inline def setChoice(value: typings.inquirer.choiceMod.^[T]): Self = StObject.set(x, "Choice", value.asInstanceOf[js.Any])
    
    inline def setChoiceOptions(value: ChoiceOptions[T]): Self = StObject.set(x, "ChoiceOptions", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: typings.inquirer.separatorMod.^): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorOptions(value: SeparatorOptions): Self = StObject.set(x, "SeparatorOptions", value.asInstanceOf[js.Any])
  }
}
