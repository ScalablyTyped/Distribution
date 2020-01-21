package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information of navigation behavior.
  */
@js.native
trait SchemaNavigationInfo extends js.Object {
  /**
    * If this option is on, FDL click will be forced to redirect rather than
    * show an interstitial page.
    */
  var enableForcedRedirect: js.UndefOr[Boolean] = js.native
}

object SchemaNavigationInfo {
  @scala.inline
  def apply(enableForcedRedirect: js.UndefOr[Boolean] = js.undefined): SchemaNavigationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableForcedRedirect)) __obj.updateDynamic("enableForcedRedirect")(enableForcedRedirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNavigationInfo]
  }
}

