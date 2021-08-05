package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types for the `ExpandQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait ExpandChoiceMap[T /* <: Answers */]
  extends StObject
     with BaseChoiceMap[T] {
  
  var ExpandChoiceOptions: typings.inquirer.mod.ExpandChoiceOptions[T]
}
object ExpandChoiceMap {
  
  inline def apply[T /* <: Answers */](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ExpandChoiceOptions: ExpandChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ExpandChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ExpandChoiceOptions = ExpandChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandChoiceMap[T]]
  }
  
  extension [Self <: ExpandChoiceMap[?], T /* <: Answers */](x: Self & ExpandChoiceMap[T]) {
    
    inline def setExpandChoiceOptions(value: ExpandChoiceOptions[T]): Self = StObject.set(x, "ExpandChoiceOptions", value.asInstanceOf[js.Any])
  }
}
