package typings.atIonicCliDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsMod {
  import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.checkbox
  import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.confirm
  import typings.inquirer.inquirerMod.Answers

  type Inquirer = typings.inquirer.inquirerMod.Inquirer
  type PromptType = PromptTypeConfirm | PromptTypeCheckbox | PromptTypeOther
  type PromptTypeCheckbox = checkbox
  type PromptTypeConfirm = confirm
  type PromptValue = PromptValueConfirm | PromptValueCheckbox | PromptValueOther
  type PromptValueCheckbox = js.Array[String]
  type PromptValueConfirm = Boolean
  type PromptValueOther = String
  type Question = typings.inquirer.inquirerMod.Question[Answers]
  type Separator = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_inquirer.objects.Separator */ js.Any
}
