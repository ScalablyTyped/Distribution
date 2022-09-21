package typings.inquirer

import typings.inquirer.mod.Answers
import typings.inquirer.mod.StreamOptions
import typings.inquirer.mod.default.ui.Prompt
import typings.inquirer.mod.inquirer.prompts.PromptCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptMod {
  
  /**
    * Represents the prompt ui.
    */
  @JSImport("inquirer/lib/ui/prompt", JSImport.Default)
  @js.native
  open class default[T /* <: Answers */] protected () extends Prompt[T] {
    /**
      * Initializes a new instance of the {@link Prompt `Prompt`} class.
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
}
