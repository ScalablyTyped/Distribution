package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSuccessDetail extends js.Object {
  /**
    * If a native process other than the app crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
}

object SchemaSuccessDetail {
  @scala.inline
  def apply(otherNativeCrash: js.UndefOr[Boolean] = js.undefined): SchemaSuccessDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(otherNativeCrash)) __obj.updateDynamic("otherNativeCrash")(otherNativeCrash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuccessDetail]
  }
}

