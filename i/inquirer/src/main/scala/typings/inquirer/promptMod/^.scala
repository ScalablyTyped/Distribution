package typings.inquirer.promptMod

import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.prompts.PromptCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the prompt ui.
  */
@JSImport("inquirer/lib/ui/prompt", JSImport.Namespace)
@js.native
class ^ protected () extends PromptUI {
  /**
    * Initializes a new instance of the `PromptUI` class.
    *
    * @param prompts
    * The prompts for the ui.
    *
    * @param options
    * The input- and output-stream of the ui.
    */
  def this(prompts: PromptCollection) = this()
  def this(prompts: PromptCollection, options: StreamOptions) = this()
}

