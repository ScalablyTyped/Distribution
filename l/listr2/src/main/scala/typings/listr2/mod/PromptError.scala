package typings.listr2.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal error handling mechanism for Listr prompts to identify the failing cause is coming from a prompt.
  *
  * @see {@link https://listr2.kilic.dev/task/prompts.html}
  */
@JSImport("listr2", "PromptError")
@js.native
open class PromptError ()
  extends StObject
     with Error
     with ListrTaskPrompt {
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
