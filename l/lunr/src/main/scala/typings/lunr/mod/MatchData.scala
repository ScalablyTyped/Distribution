package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains and collects metadata about a matching document.
  * A single instance of lunr.MatchData is returned as part of every
  * lunr.IndexResult.
  */
@JSImport("lunr", "MatchData")
@js.native
class MatchData protected () extends js.Object {
  /**
    * @param term - The term this match data is associated with
    * @param field - The field in which the term was found
    * @param metadata - The metadata recorded about this term in this field
    */
  def this(term: String, field: String, metadata: js.Object) = this()
  
  /**
    * An instance of lunr.MatchData will be created for every term that matches a
    * document. However only one instance is required in a lunr.Index~Result. This
    * method combines metadata from another instance of lunr.MatchData with this
    * objects metadata.
    *
    * @param otherMatchData - Another instance of match data to merge with this one.
    * @see {@link lunr.Index~Result}
    */
  def combine(otherMatchData: MatchData): Unit = js.native
  
  /**
    * A cloned collection of metadata associated with this document.
    */
  var metadata: js.Object = js.native
}
