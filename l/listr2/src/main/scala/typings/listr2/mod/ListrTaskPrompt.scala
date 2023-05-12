package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tasks can have attached prompts to them.
  *
  * - Whenever the prompt is running this should be with full with the instance of current prompt.
  * - Whenever the prompt fails/cancelled it is tracked here as well due to some internal complication with `enquirer`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.listr2.mod.PromptInstance
  - typings.listr2.mod.PromptError
*/
trait ListrTaskPrompt extends StObject
