package typings.levenshtein.levenshteinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Levenshtein extends js.Object {
  /**
    * Distance between strings
    */
  var distance: Double
  /**
    * Return the Levenshtein table.
    */
  def getMatrix(): js.Array[js.Array[Double]]
  /**
    * Pretty print Levenshtein table.
    */
  def inspect(): String
}

object Levenshtein {
  @scala.inline
  def apply(
    distance: Double,
    getMatrix: () => js.Array[js.Array[Double]],
    inspect: () => String,
    toString: () => String,
    valueOf: () => Double
  ): Levenshtein = {
    val __obj = js.Dynamic.literal(distance = distance, getMatrix = js.Any.fromFunction0(getMatrix), inspect = js.Any.fromFunction0(inspect), toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Levenshtein]
  }
}

