package typings.inquirer.libUiPromptMod

import typings.inquirer.inquirerMod.StreamOptions
import typings.inquirer.inquirerMod.prompts.PromptCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

