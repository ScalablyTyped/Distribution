package typings.levenshtein.mod

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
  def apply(distance: Double, getMatrix: () => js.Array[js.Array[Double]], inspect: () => String): Levenshtein = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], getMatrix = js.Any.fromFunction0(getMatrix), inspect = js.Any.fromFunction0(inspect))
  
    __obj.asInstanceOf[Levenshtein]
  }
}

