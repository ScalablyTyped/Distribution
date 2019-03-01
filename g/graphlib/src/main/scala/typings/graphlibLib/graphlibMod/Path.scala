package typings
package graphlibLib.graphlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var distance: scala.Double
  var predecessor: java.lang.String
}

object Path {
  @scala.inline
  def apply(distance: scala.Double, predecessor: java.lang.String): Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("predecessor")(predecessor)
    __obj.asInstanceOf[Path]
  }
}

