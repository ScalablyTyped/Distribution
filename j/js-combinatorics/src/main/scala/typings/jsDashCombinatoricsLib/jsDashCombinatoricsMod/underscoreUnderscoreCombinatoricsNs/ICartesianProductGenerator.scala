package typings
package jsDashCombinatoricsLib.jsDashCombinatoricsMod.underscoreUnderscoreCombinatoricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICartesianProductGenerator[T] extends IPredictableGenerator[T] {
  /**
  		 * Arguments are coordinates in integer.
  		 * Arguments can be out of bounds but it returns undefined in such cases.
  		 */
  def get(coordinates: scala.Double*): T
}

