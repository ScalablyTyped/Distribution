package typings
package latlonDashGeohashLib.latlonDashGeohashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Neighbours extends js.Object {
  var e: java.lang.String
  var n: java.lang.String
  @JSName("ne")
  var ne_FNeighbours: java.lang.String
  var nw: java.lang.String
  var s: java.lang.String
  var se: java.lang.String
  var sw: java.lang.String
  var w: java.lang.String
}

object Neighbours {
  @scala.inline
  def apply(
    e: java.lang.String,
    n: java.lang.String,
    ne: java.lang.String,
    nw: java.lang.String,
    s: java.lang.String,
    se: java.lang.String,
    sw: java.lang.String,
    w: java.lang.String
  ): Neighbours = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("n")(n)
    __obj.updateDynamic("ne")(ne)
    __obj.updateDynamic("nw")(nw)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("se")(se)
    __obj.updateDynamic("sw")(sw)
    __obj.updateDynamic("w")(w)
    __obj.asInstanceOf[Neighbours]
  }
}

