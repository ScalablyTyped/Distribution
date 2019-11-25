package typings.leafletDashDraw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clickable extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.undefined
}

object Anon_Clickable {
  @scala.inline
  def apply(clickable: js.UndefOr[Boolean] = js.undefined): Anon_Clickable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clickable]
  }
}

