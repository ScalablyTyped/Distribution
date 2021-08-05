package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types.
  *
  * @template T
  * The type of the answers.
  */
trait AllChoiceMap[T /* <: Answers */] extends StObject {
  
  var BaseChoiceMap: typings.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.separatorMod.^
  
  var CheckboxChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | SeparatorOptions | CheckboxChoiceOptions[T] | typings.inquirer.choiceMod.^[T]
  
  var ExpandChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | SeparatorOptions | ExpandChoiceOptions[T] | typings.inquirer.choiceMod.^[T]
  
  var ListChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.choiceMod.^[T]
}
object AllChoiceMap {
  
  inline def apply[T /* <: Answers */](
    BaseChoiceMap: typings.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.separatorMod.^,
    CheckboxChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | SeparatorOptions | CheckboxChoiceOptions[T] | typings.inquirer.choiceMod.^[T],
    ExpandChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | SeparatorOptions | ExpandChoiceOptions[T] | typings.inquirer.choiceMod.^[T],
    ListChoiceMap: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.choiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
  
  extension [Self <: AllChoiceMap[?], T /* <: Answers */](x: Self & AllChoiceMap[T]) {
    
    inline def setBaseChoiceMap(
      value: typings.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typings.inquirer.separatorMod.^
    ): Self = StObject.set(x, "BaseChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setCheckboxChoiceMap(
      value: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | SeparatorOptions | CheckboxChoiceOptions[T] | typings.inquirer.choiceMod.^[T]
    ): Self = StObject.set(x, "CheckboxChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setExpandChoiceMap(
      value: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | SeparatorOptions | ExpandChoiceOptions[T] | typings.inquirer.choiceMod.^[T]
    ): Self = StObject.set(x, "ExpandChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setListChoiceMap(
      value: ChoiceOptions[T] | typings.inquirer.separatorMod.^ | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.choiceMod.^[T]
    ): Self = StObject.set(x, "ListChoiceMap", value.asInstanceOf[js.Any])
  }
}
