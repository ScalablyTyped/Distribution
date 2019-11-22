package typings.latlonDashGeohash.latlonDashGeohashMod.Geohash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Neighbours extends js.Object {
  var e: String
  var n: String
  @JSName("ne")
  var ne_FNeighbours: String
  var nw: String
  var s: String
  var se: String
  var sw: String
  var w: String
}

object Neighbours {
  @scala.inline
  def apply(e: String, n: String, ne: String, nw: String, s: String, se: String, sw: String, w: String): Neighbours = {
    val __obj = js.Dynamic.literal(e = e, n = n, ne = ne, nw = nw, s = s, se = se, sw = sw, w = w)
  
    __obj.asInstanceOf[Neighbours]
  }
}

