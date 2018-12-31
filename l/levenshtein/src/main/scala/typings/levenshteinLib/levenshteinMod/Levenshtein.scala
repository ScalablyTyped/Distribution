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

