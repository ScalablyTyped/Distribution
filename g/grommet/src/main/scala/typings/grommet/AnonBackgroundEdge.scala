package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundEdge extends js.Object {
  var background: js.UndefOr[AnonInvert] = js.undefined
  var edge: js.UndefOr[AnonType] = js.undefined
}

object AnonBackgroundEdge {
  @scala.inline
  def apply(background: AnonInvert = null, edge: AnonType = null): AnonBackgroundEdge = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundEdge]
  }
}

