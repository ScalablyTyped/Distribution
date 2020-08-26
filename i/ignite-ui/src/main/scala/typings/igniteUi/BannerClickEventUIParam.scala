package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BannerClickEventUIParam extends js.Object {
  /**
    * Get the banner html element in the DOM.
    */
  var bannerElement: js.UndefOr[js.Any] = js.native
}

object BannerClickEventUIParam {
  @scala.inline
  def apply(): BannerClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BannerClickEventUIParam]
  }
  @scala.inline
  implicit class BannerClickEventUIParamOps[Self <: BannerClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setBannerElement(value: js.Any): Self = this.set("bannerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBannerElement: Self = this.set("bannerElement", js.undefined)
  }
  
}

