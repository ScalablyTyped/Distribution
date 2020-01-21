package typings.mapsjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdx extends js.Object {
  var idx: Double
  var setIdx: Double
}

object AnonIdx {
  @scala.inline
  def apply(idx: Double, setIdx: Double): AnonIdx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdx]
  }
}

