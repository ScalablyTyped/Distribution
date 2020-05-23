package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalMinima extends js.Object {
  var Y: Double
  var leftBound: TEdge
  var next: TEdge
  var rightBound: TEdge
}

object LocalMinima {
  @scala.inline
  def apply(Y: Double, leftBound: TEdge, next: TEdge, rightBound: TEdge): LocalMinima = {
    val __obj = js.Dynamic.literal(Y = Y.asInstanceOf[js.Any], leftBound = leftBound.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], rightBound = rightBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalMinima]
  }
}

