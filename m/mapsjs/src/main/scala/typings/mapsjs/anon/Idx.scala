package typings.mapsjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Idx extends js.Object {
  var idx: Double
  var setIdx: Double
}

object Idx {
  @scala.inline
  def apply(idx: Double, setIdx: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
}

