package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lunr", "stopWordFilter")
@js.native
object stopWordFilter extends js.Object {
  /**
    * lunr.stopWordFilter is an English language stop word list filter, any words
    * contained in the list will not be passed through the filter.
    *
    * This is intended to be used in the Pipeline. If the token does not pass the
    * filter then undefined will be returned.
    *
    * Implements {lunr.PipelineFunction}
    *
    * @param token - A token to check for being a stop word.
    * @see {@link lunr.Pipeline}
    */
  def apply(token: Token): Token = js.native
}

