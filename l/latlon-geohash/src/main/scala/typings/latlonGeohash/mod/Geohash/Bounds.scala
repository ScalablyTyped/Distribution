package typings.latlonGeohash.mod.Geohash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  @JSName("ne")
  var ne_FBounds: Point
  var sw: Point
}

object Bounds {
  @scala.inline
  def apply(ne: Point, sw: Point): Bounds = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bounds]
  }
}

