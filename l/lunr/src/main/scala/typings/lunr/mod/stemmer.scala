package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lunr", "stemmer")
@js.native
object stemmer extends js.Object {
  
  /**
    * lunr.stemmer is an english language stemmer, this is a JavaScript
    * implementation of the PorterStemmer taken from http://tartarus.org/~martin
    *
    * Implements {lunr.PipelineFunction}
    *
    * @param token - The string to stem
    * @see {@link lunr.Pipeline}
    */
  def apply(token: Token): Token = js.native
}
