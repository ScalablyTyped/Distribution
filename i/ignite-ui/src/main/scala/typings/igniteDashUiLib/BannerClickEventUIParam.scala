package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannerClickEventUIParam extends js.Object {
  /**
  	 * Get the banner html element in the DOM.
  	 */
  var bannerElement: js.UndefOr[js.Any] = js.undefined
}

object BannerClickEventUIParam {
  @scala.inline
  def apply(bannerElement: js.Any = null): BannerClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (bannerElement != null) __obj.updateDynamic("bannerElement")(bannerElement)
    __obj.asInstanceOf[BannerClickEventUIParam]
  }
}

