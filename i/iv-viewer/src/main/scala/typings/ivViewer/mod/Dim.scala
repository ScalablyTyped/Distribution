package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dim extends js.Object {
  var h: Double
  var w: Double
}

object Dim {
  @scala.inline
  def apply(h: Double, w: Double): Dim = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dim]
  }
}

