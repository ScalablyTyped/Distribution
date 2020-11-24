package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lunr", "trimmer")
@js.native
object trimmer extends js.Object {
  
  /**
    * lunr.trimmer is a pipeline function for trimming non word
    * characters from the beginning and end of tokens before they
    * enter the index.
    *
    * This implementation may not work correctly for non latin
    * characters and should either be removed or adapted for use
    * with languages with non-latin characters.
    *
    * Implements {lunr.PipelineFunction}
    *
    * @param token The token to pass through the filter
    * @see lunr.Pipeline
    */
  def apply(token: Token): Token = js.native
}
