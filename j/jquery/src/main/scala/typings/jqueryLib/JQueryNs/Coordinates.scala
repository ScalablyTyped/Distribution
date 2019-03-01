package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// region Coordinates
// #region Coordinates
trait Coordinates extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object Coordinates {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): Coordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Coordinates]
  }
}

