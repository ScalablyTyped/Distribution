package typings.atIonicCore.distTypesUtilsElementDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorInterface extends js.Object {
  var download: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object AnchorInterface {
  @scala.inline
  def apply(download: String = null, href: String = null, rel: String = null, target: String = null): AnchorInterface = {
    val __obj = js.Dynamic.literal()
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorInterface]
  }
}

