package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundEdge extends js.Object {
  var background: js.UndefOr[Anon_Invert] = js.undefined
  var edge: js.UndefOr[Anon_Type] = js.undefined
}

object Anon_BackgroundEdge {
  @scala.inline
  def apply(background: Anon_Invert = null, edge: Anon_Type = null): Anon_BackgroundEdge = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (edge != null) __obj.updateDynamic("edge")(edge)
    __obj.asInstanceOf[Anon_BackgroundEdge]
  }
}

