package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChoiceMap[T /* <: Answers */]
  extends StObject
     with BaseChoiceMap[T] {
  
  var ListChoiceOptions: typings.inquirer.mod.ListChoiceOptions[T]
}
object ListChoiceMap {
  
  inline def apply[T /* <: Answers */](
    Choice: typings.inquirer.libObjectsChoiceMod.default[T],
    ChoiceOptions: ChoiceOptions,
    ListChoiceOptions: ListChoiceOptions[T],
    Separator: typings.inquirer.libObjectsSeparatorMod.default,
    SeparatorOptions: SeparatorOptions
  ): ListChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ListChoiceOptions = ListChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChoiceMap[T]]
  }
  
  extension [Self <: ListChoiceMap[?], T /* <: Answers */](x: Self & ListChoiceMap[T]) {
    
    inline def setListChoiceOptions(value: ListChoiceOptions[T]): Self = StObject.set(x, "ListChoiceOptions", value.asInstanceOf[js.Any])
  }
}
