package typings.atMapboxTileDashCover.atMapboxTileDashCoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limits extends js.Object {
  var max_zoom: Double
  var min_zoom: Double
}

object Limits {
  @scala.inline
  def apply(max_zoom: Double, min_zoom: Double): Limits = {
    val __obj = js.Dynamic.literal(max_zoom = max_zoom.asInstanceOf[js.Any], min_zoom = min_zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Limits]
  }
}

