package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPromptsMod {
  type Inquirer = inquirerLib.inquirerMod.Inquirer
  type PromptType = PromptTypeConfirm | PromptTypeCheckbox | PromptTypeOther
  type PromptTypeCheckbox = atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.checkbox
  type PromptTypeConfirm = atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.confirm
  type PromptValue = PromptValueConfirm | PromptValueCheckbox | PromptValueOther
  type PromptValueCheckbox = js.Array[java.lang.String]
  type PromptValueConfirm = scala.Boolean
  type PromptValueOther = java.lang.String
  type Question = inquirerLib.inquirerMod.Question[inquirerLib.inquirerMod.Answers]
  type Separator = inquirerLib.inquirerMod.objectsNs.Separator
}
