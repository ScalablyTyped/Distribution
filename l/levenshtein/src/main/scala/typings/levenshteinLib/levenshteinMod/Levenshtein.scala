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
    getMatrix: js.Function0[js.Array[js.Array[scala.Double]]],
    inspect: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    valueOf: js.Function0[scala.Double]
  ): Levenshtein = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("getMatrix")(getMatrix)
    __obj.updateDynamic("inspect")(inspect)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("valueOf")(valueOf)
    __obj.asInstanceOf[Levenshtein]
  }
}

