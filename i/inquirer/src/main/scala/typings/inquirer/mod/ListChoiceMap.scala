package typings.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types for the `ListQuestion`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ListChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  
  var ListChoiceOptions: typings.inquirer.mod.ListChoiceOptions[T] = js.native
}
object ListChoiceMap {
  
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ListChoiceOptions: ListChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ListChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ListChoiceOptions = ListChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChoiceMap[T]]
  }
  
  @scala.inline
  implicit class ListChoiceMapMutableBuilder[Self <: ListChoiceMap[_], T /* <: Answers */] (val x: Self with ListChoiceMap[T]) extends AnyVal {
    
    @scala.inline
    def setListChoiceOptions(value: ListChoiceOptions[T]): Self = StObject.set(x, "ListChoiceOptions", value.asInstanceOf[js.Any])
  }
}
