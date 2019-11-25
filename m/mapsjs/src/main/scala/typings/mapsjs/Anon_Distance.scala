package typings.mapsjs

import typings.mapsjs.mapsjsMod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Distance extends js.Object {
  var distance: Double
  var pt: point
  var ptIdx: Double
  var setIdx: Double
}

object Anon_Distance {
  @scala.inline
  def apply(distance: Double, pt: point, ptIdx: Double, setIdx: Double): Anon_Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any], ptIdx = ptIdx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Distance]
  }
}

