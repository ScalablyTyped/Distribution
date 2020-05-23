package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BannerVisibleEventUIParam extends js.Object {
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

object BannerVisibleEventUIParam {
  @scala.inline
  def apply(banner: js.Any = null, bannerElement: js.Any = null, index: js.UndefOr[Double] = js.undefined): BannerVisibleEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (bannerElement != null) __obj.updateDynamic("bannerElement")(bannerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerVisibleEventUIParam]
  }
}

