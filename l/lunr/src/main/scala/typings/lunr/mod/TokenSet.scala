package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A token set is used to store the unique list of all tokens
  * within an index. Token sets are also used to represent an
  * incoming query to the index, this query token set and index
  * token set are then intersected to find which tokens to look
  * up in the inverted index.
  *
  * A token set can hold multiple tokens, as in the case of the
  * index token set, or it can hold a single token as in the
  * case of a simple query token set.
  *
  * Additionally token sets are used to perform wildcard matching.
  * Leading, contained and trailing wildcards are supported, and
  * from this edit distance matching can also be provided.
  *
  * Token sets are implemented as a minimal finite state automata,
  * where both common prefixes and suffixes are shared between tokens.
  * This helps to reduce the space used for storing the token set.
  */
@JSImport("lunr", "TokenSet")
@js.native
class TokenSet () extends js.Object {
  /**
    * Creates a TokenSet instance from the given sorted array of words.
    *
    * @param arr - A sorted array of strings to create the set from.
    * @throws Will throw an error if the input array is not sorted.
    */
  def fromArray(arr: js.Array[String]): TokenSet = js.native
  /**
    * Creates a token set representing a single string with a specified
    * edit distance.
    *
    * Insertions, deletions, substitutions and transpositions are each
    * treated as an edit distance of 1.
    *
    * Increasing the allowed edit distance will have a dramatic impact
    * on the performance of both creating and intersecting these TokenSets.
    * It is advised to keep the edit distance less than 3.
    *
    * @param str - The string to create the token set from.
    * @param editDistance - The allowed edit distance to match.
    */
  def fromFuzzyString(str: String, editDistance: Double): Vector = js.native
  /**
    * Creates a TokenSet from a string.
    *
    * The string may contain one or more wildcard characters (*)
    * that will allow wildcard matching when intersecting with
    * another TokenSet.
    *
    * @param str - The string to create a TokenSet from.
    */
  def fromString(str: String): TokenSet = js.native
  /**
    * Returns a new TokenSet that is the intersection of
    * this TokenSet and the passed TokenSet.
    *
    * This intersection will take into account any wildcards
    * contained within the TokenSet.
    *
    * @param b - An other TokenSet to intersect with.
    */
  def intersect(b: TokenSet): TokenSet = js.native
  /**
    * Converts this TokenSet into an array of strings
    * contained within the TokenSet.
    *
    */
  def toArray(): js.Array[String] = js.native
}

