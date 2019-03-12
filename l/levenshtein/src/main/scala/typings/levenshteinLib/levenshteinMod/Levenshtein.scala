package typings
package levenshteinLib.levenshteinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Levenshtein extends js.Object {
  /**
    * Distance between strings
    */
  var distance: scala.Double
  /**
    * Return the Levenshtein table.
    */
  def getMatrix(): js.Array[js.Array[scala.Double]]
  /**
    * Pretty print Levenshtein table.
    */
  def inspect(): java.lang.String
}

object Levenshtein {
  @scala.inline
  def apply(
    distance: scala.Double,
    getMatrix: () => js.Array[js.Array[scala.Double]],
    inspect: () => java.lang.String,
    toString: () => java.lang.String,
    valueOf: () => scala.Double
  ): Levenshtein = {
    val __obj = js.Dynamic.literal(distance = distance, getMatrix = js.Any.fromFunction0(getMatrix), inspect = js.Any.fromFunction0(inspect), toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[Levenshtein]
  }
}

