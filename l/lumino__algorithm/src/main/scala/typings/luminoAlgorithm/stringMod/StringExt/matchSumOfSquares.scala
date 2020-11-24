package typings.luminoAlgorithm.stringMod.StringExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/string", "StringExt.matchSumOfSquares")
@js.native
object matchSumOfSquares extends js.Object {
  
  /**
    * A string matcher which uses a sum-of-squares algorithm.
    *
    * @param source - The source text which should be searched.
    *
    * @param query - The characters to locate in the source text.
    *
    * @param start - The index to start the search.
    *
    * @returns The match result, or `null` if there is no match.
    *   A lower `score` represents a stronger match.
    *
    * #### Complexity
    * Linear on `sourceText`.
    *
    * #### Notes
    * This scoring algorithm uses a sum-of-squares approach to determine
    * the score. In order for there to be a match, all of the characters
    * in `query` **must** appear in `source` in order. The index of each
    * matching character is squared and added to the score. This means
    * that early and consecutive character matches are preferred, while
    * late matches are heavily penalized.
    */
  def apply(source: String, query: String): IMatchResult | Null = js.native
  def apply(source: String, query: String, start: Double): IMatchResult | Null = js.native
}
