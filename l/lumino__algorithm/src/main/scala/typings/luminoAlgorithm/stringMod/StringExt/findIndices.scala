package typings.luminoAlgorithm.stringMod.StringExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/string", "StringExt.findIndices")
@js.native
object findIndices extends js.Object {
  /**
    * Find the indices of characters in a source text.
    *
    * @param source - The source text which should be searched.
    *
    * @param query - The characters to locate in the source text.
    *
    * @param start - The index to start the search.
    *
    * @returns The matched indices, or `null` if there is no match.
    *
    * #### Complexity
    * Linear on `sourceText`.
    *
    * #### Notes
    * In order for there to be a match, all of the characters in `query`
    * **must** appear in `source` in the order given by `query`.
    *
    * Characters are matched using strict `===` equality.
    */
  def apply(source: String, query: String): js.Array[Double] | Null = js.native
  def apply(source: String, query: String, start: Double): js.Array[Double] | Null = js.native
}

