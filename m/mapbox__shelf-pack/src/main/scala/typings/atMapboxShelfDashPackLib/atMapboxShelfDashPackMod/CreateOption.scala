package typings
package atMapboxShelfDashPackLib.atMapboxShelfDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOption extends js.Object {
  /// If true , the sprite will automatically grow
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateOption {
  @scala.inline
  def apply(autoResize: js.UndefOr[scala.Boolean] = js.undefined): CreateOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    __obj.asInstanceOf[CreateOption]
  }
}

