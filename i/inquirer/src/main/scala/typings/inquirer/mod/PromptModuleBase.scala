package typings.inquirer.mod

import typings.inquirer.mod.prompts.PromptConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides prompts for answering questions.
  */
@js.native
trait PromptModuleBase extends StObject {
  
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
object PromptModuleBase {
  
  @scala.inline
  def apply(registerPrompt: (String, PromptConstructor) => Unit, restoreDefaultPrompts: () => Unit): PromptModuleBase = {
    val __obj = js.Dynamic.literal(registerPrompt = js.Any.fromFunction2(registerPrompt), restoreDefaultPrompts = js.Any.fromFunction0(restoreDefaultPrompts))
    __obj.asInstanceOf[PromptModuleBase]
  }
  
  @scala.inline
  implicit class PromptModuleBaseMutableBuilder[Self <: PromptModuleBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterPrompt(value: (String, PromptConstructor) => Unit): Self = StObject.set(x, "registerPrompt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRestoreDefaultPrompts(value: () => Unit): Self = StObject.set(x, "restoreDefaultPrompts", js.Any.fromFunction0(value))
  }
}
