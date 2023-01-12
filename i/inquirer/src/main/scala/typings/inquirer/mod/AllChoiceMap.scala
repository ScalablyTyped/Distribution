package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllChoiceMap[T /* <: Answers */] extends StObject {
  
  var BaseChoiceMap: typings.inquirer.libObjectsChoiceMod.default[T] | ChoiceOptions | typings.inquirer.libObjectsSeparatorMod.default | SeparatorOptions
  
  var CheckboxChoiceMap: ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default | CheckboxChoiceOptions[T]
  
  var ExpandChoiceMap: ExpandChoiceOptions | ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default
  
  var ListChoiceMap: ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default
}
object AllChoiceMap {
  
  inline def apply[T /* <: Answers */](
    BaseChoiceMap: typings.inquirer.libObjectsChoiceMod.default[T] | ChoiceOptions | typings.inquirer.libObjectsSeparatorMod.default | SeparatorOptions,
    CheckboxChoiceMap: ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default | CheckboxChoiceOptions[T],
    ExpandChoiceMap: ExpandChoiceOptions | ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default,
    ListChoiceMap: ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllChoiceMap[?], T /* <: Answers */] (val x: Self & AllChoiceMap[T]) extends AnyVal {
    
    inline def setBaseChoiceMap(
      value: typings.inquirer.libObjectsChoiceMod.default[T] | ChoiceOptions | typings.inquirer.libObjectsSeparatorMod.default | SeparatorOptions
    ): Self = StObject.set(x, "BaseChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setCheckboxChoiceMap(
      value: ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default | CheckboxChoiceOptions[T]
    ): Self = StObject.set(x, "CheckboxChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setExpandChoiceMap(
      value: ExpandChoiceOptions | ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default
    ): Self = StObject.set(x, "ExpandChoiceMap", value.asInstanceOf[js.Any])
    
    inline def setListChoiceMap(
      value: ChoiceOptions | typings.inquirer.libObjectsChoiceMod.default[T] | ListChoiceOptions[T] | SeparatorOptions | typings.inquirer.libObjectsSeparatorMod.default
    ): Self = StObject.set(x, "ListChoiceMap", value.asInstanceOf[js.Any])
  }
}
