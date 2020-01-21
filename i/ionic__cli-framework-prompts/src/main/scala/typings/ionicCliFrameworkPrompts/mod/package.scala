package typings.ionicCliFrameworkPrompts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Inquirer = typings.inquirer.mod.Inquirer
  type PromptType = typings.ionicCliFrameworkPrompts.mod.PromptTypeConfirm | typings.ionicCliFrameworkPrompts.mod.PromptTypeCheckbox | typings.ionicCliFrameworkPrompts.mod.PromptTypeOther
  type PromptTypeCheckbox = typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.checkbox
  type PromptTypeConfirm = typings.ionicCliFrameworkPrompts.ionicCliFrameworkPromptsStrings.confirm
  type PromptValue = typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm | typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox | typings.ionicCliFrameworkPrompts.mod.PromptValueOther
  type PromptValueCheckbox = js.Array[java.lang.String]
  type PromptValueConfirm = scala.Boolean
  type PromptValueOther = java.lang.String
  type Question = typings.inquirer.mod.Question[typings.inquirer.mod.Answers]
  type Separator = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_inquirer.objects.Separator */ js.Any
}
