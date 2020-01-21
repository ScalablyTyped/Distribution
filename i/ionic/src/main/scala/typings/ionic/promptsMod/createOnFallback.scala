package typings.ionic.promptsMod

import typings.ionicCliFrameworkPrompts.mod.PromptQuestion
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/prompts", "createOnFallback")
@js.native
object createOnFallback extends js.Object {
  def apply(hasFlagsLog: CreateOnFallbackOptions): js.Function1[/* question */ PromptQuestion, String | Boolean | Unit | PromptValueCheckbox] = js.native
}

