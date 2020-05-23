package typings.mapsjs.anon

import typings.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var distance: Double
  var pt: point
  var ptIdx: Double
  var setIdx: Double
}

object Distance {
  @scala.inline
  def apply(distance: Double, pt: point, ptIdx: Double, setIdx: Double): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ptIdx = ptIdx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
}

