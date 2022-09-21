package typings.inquirer.mod

import typings.inquirer.mod.inquirer.prompts.PromptConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptModuleBase extends PromptFunction {
  
  /**
    * Registers a new prompt-type.
    *
    * @param name
    * The name of the prompt.
    *
    * @param prompt
    * The constructor of the prompt.
    */
  def registerPrompt(name: String, prompt: PromptConstructor): Unit = js.native
  
  /**
    * Registers the default prompts.
    */
  def restoreDefaultPrompts(): Unit = js.native
}
