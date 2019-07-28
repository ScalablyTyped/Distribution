package typings.atIonicCliDashFramework

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.checkbox
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.confirm
import typings.inquirer.inquirerMod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsMod {
  type Inquirer = typings.inquirer.inquirerMod.Inquirer
  type PromptType = PromptTypeConfirm | PromptTypeCheckbox | PromptTypeOther
  type PromptTypeCheckbox = checkbox
  type PromptTypeConfirm = confirm
  type PromptValue = PromptValueConfirm | PromptValueCheckbox | PromptValueOther
  type PromptValueCheckbox = js.Array[String]
  type PromptValueConfirm = Boolean
  type PromptValueOther = String
  type Question = typings.inquirer.inquirerMod.Question[Answers]
  type Separator = typings.inquirer.inquirerMod.objectsNs.Separator
}
