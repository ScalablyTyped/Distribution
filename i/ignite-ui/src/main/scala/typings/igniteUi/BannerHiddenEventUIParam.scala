package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannerHiddenEventUIParam extends js.Object {
  /**
  	 * Get the banner object from the banners array.
  	 */
  var banner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the banner html element in the DOM.
  	 */
  var bannerElement: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the banner index in the banners array.
  	 */
  var index: js.UndefOr[Double] = js.undefined
}

object BannerHiddenEventUIParam {
  @scala.inline
  def apply(banner: js.Any = null, bannerElement: js.Any = null, index: Int | Double = null): BannerHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (bannerElement != null) __obj.updateDynamic("bannerElement")(bannerElement.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerHiddenEventUIParam]
  }
}

