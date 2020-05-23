package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var background: js.UndefOr[Invert] = js.undefined
  var edge: js.UndefOr[Type] = js.undefined
}

object Edge {
  @scala.inline
  def apply(background: Invert = null, edge: Type = null): Edge = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

