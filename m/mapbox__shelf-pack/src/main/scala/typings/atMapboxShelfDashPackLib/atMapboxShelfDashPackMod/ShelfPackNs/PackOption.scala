package typings
package atMapboxShelfDashPackLib.atMapboxShelfDashPackMod.ShelfPackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOption extends js.Object {
  /// If true , the supplied bin objects will be updated inplace with x and y properties
  var inPlace: js.UndefOr[scala.Boolean] = js.undefined
}

object PackOption {
  @scala.inline
  def apply(inPlace: js.UndefOr[scala.Boolean] = js.undefined): PackOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inPlace)) __obj.updateDynamic("inPlace")(inPlace)
    __obj.asInstanceOf[PackOption]
  }
}

