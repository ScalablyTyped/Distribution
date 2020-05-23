package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scanbeam extends js.Object {
  var Y: Double
  var next: TEdge
}

object Scanbeam {
  @scala.inline
  def apply(Y: Double, next: TEdge): Scanbeam = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scanbeam]
  }
}

