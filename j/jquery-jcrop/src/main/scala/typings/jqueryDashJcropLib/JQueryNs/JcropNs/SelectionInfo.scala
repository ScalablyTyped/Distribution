package typings
package jqueryDashJcropLib.JQueryNs.JcropNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionInfo extends js.Object {
  var h: scala.Double
  var w: scala.Double
  var x: scala.Double
  var x2: scala.Double
  var y: scala.Double
  var y2: scala.Double
}

object SelectionInfo {
  @scala.inline
  def apply(
    h: scala.Double,
    w: scala.Double,
    x: scala.Double,
    x2: scala.Double,
    y: scala.Double,
    y2: scala.Double
  ): SelectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("x2")(x2)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[SelectionInfo]
  }
}

