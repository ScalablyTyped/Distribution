package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Override extends js.Object {
  var `override`: js.UndefOr[Boolean] = js.undefined
}

object Anon_Override {
  @scala.inline
  def apply(`override`: js.UndefOr[Boolean] = js.undefined): Anon_Override = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[Anon_Override]
  }
}

