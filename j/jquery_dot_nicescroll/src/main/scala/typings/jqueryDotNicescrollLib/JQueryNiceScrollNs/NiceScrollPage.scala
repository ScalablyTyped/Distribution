package typings
package jqueryDotNicescrollLib.JQueryNiceScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NiceScrollPage extends js.Object {
  var h: scala.Double
  var height: scala.Double
  var maxh: scala.Double
  var maxw: scala.Double
  var w: scala.Double
  var width: scala.Double
}

object NiceScrollPage {
  @scala.inline
  def apply(
    h: scala.Double,
    height: scala.Double,
    maxh: scala.Double,
    maxw: scala.Double,
    w: scala.Double,
    width: scala.Double
  ): NiceScrollPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("maxh")(maxh)
    __obj.updateDynamic("maxw")(maxw)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[NiceScrollPage]
  }
}

