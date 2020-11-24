package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types for any kind of question.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait BaseChoiceMap[T /* <: Answers */] extends js.Object {
  
  var Choice: typings.inquirer.choiceMod.^[T] = js.native
  
  var ChoiceOptions: typings.inquirer.mod.ChoiceOptions[T] = js.native
  
  var Separator: typings.inquirer.separatorMod.^ = js.native
  
  var SeparatorOptions: typings.inquirer.mod.SeparatorOptions = js.native
}
object BaseChoiceMap {
  
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
  
  @scala.inline
  implicit class BaseChoiceMapOps[Self <: BaseChoiceMap[_], T /* <: Answers */] (val x: Self with BaseChoiceMap[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChoice(value: typings.inquirer.choiceMod.^[T]): Self = this.set("Choice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoiceOptions(value: ChoiceOptions[T]): Self = this.set("ChoiceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: typings.inquirer.separatorMod.^): Self = this.set("Separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorOptions(value: SeparatorOptions): Self = this.set("SeparatorOptions", value.asInstanceOf[js.Any])
  }
}
