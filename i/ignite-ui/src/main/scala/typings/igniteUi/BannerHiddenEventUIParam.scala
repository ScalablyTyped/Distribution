package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BannerHiddenEventUIParam extends js.Object {
  /**
    * Get the banner object from the banners array.
    */
  var banner: js.UndefOr[js.Any] = js.native
  /**
    * Get the banner html element in the DOM.
    */
  var bannerElement: js.UndefOr[js.Any] = js.native
  /**
    * Get the banner index in the banners array.
    */
  var index: js.UndefOr[Double] = js.native
}

object BannerHiddenEventUIParam {
  @scala.inline
  def apply(): BannerHiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerHiddenEventUIParam]
  }
  @scala.inline
  implicit class BannerHiddenEventUIParamOps[Self <: BannerHiddenEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBanner(value: js.Any): Self = this.set("banner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    @scala.inline
    def setBannerElement(value: js.Any): Self = this.set("bannerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBannerElement: Self = this.set("bannerElement", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

