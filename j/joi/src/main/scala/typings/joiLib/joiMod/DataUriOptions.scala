package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataUriOptions extends js.Object {
  /**
    * optional parameter defaulting to true which will require = padding if true or make padding optional if false
    */
  var paddingRequired: js.UndefOr[scala.Boolean] = js.undefined
}

object DataUriOptions {
  @scala.inline
  def apply(paddingRequired: js.UndefOr[scala.Boolean] = js.undefined): DataUriOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paddingRequired)) __obj.updateDynamic("paddingRequired")(paddingRequired)
    __obj.asInstanceOf[DataUriOptions]
  }
}

