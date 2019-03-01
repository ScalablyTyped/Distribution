package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface used to specify coordinates.
  */
trait JQueryCoordinates extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object JQueryCoordinates {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): JQueryCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[JQueryCoordinates]
  }
}

