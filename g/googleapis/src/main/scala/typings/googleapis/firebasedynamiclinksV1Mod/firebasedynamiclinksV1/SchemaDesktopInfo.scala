package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Desktop related attributes to the Dynamic Link.
  */
@js.native
trait SchemaDesktopInfo extends js.Object {
  /**
    * Link to open on desktop.
    */
  var desktopFallbackLink: js.UndefOr[String] = js.native
}

object SchemaDesktopInfo {
  @scala.inline
  def apply(desktopFallbackLink: String = null): SchemaDesktopInfo = {
    val __obj = js.Dynamic.literal()
    if (desktopFallbackLink != null) __obj.updateDynamic("desktopFallbackLink")(desktopFallbackLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDesktopInfo]
  }
}

