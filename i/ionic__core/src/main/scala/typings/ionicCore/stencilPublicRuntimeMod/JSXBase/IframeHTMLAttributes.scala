package typings.ionicCore.stencilPublicRuntimeMod.JSXBase

import typings.ionicCore.ionicCoreStrings.`lazy`
import typings.ionicCore.ionicCoreStrings.auto
import typings.ionicCore.ionicCoreStrings.eager
import typings.ionicCore.ionicCoreStrings.high
import typings.ionicCore.ionicCoreStrings.low
import typings.std.ReferrerPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IframeHTMLAttributes[T] extends HTMLAttributes[T] {
  var allow: js.UndefOr[String] = js.native
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  var allowTransparency: js.UndefOr[Boolean] = js.native
  var allowfullScreen: js.UndefOr[String | Boolean] = js.native
  var allowtransparency: js.UndefOr[String | Boolean] = js.native
  var frameBorder: js.UndefOr[Double | String] = js.native
  var frameborder: js.UndefOr[Double | String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var importance: js.UndefOr[low | auto | high] = js.native
  var loading: js.UndefOr[`lazy` | auto | eager] = js.native
  var marginHeight: js.UndefOr[Double] = js.native
  var marginWidth: js.UndefOr[Double] = js.native
  var marginheight: js.UndefOr[String | Double] = js.native
  var marginwidth: js.UndefOr[String | Double] = js.native
  var name: js.UndefOr[String] = js.native
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  var sandbox: js.UndefOr[String] = js.native
  var scrolling: js.UndefOr[String] = js.native
  var seamless: js.UndefOr[Boolean] = js.native
  var src: js.UndefOr[String] = js.native
  var srcDoc: js.UndefOr[String] = js.native
  var srcdoc: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object IframeHTMLAttributes {
  @scala.inline
  def apply[T](): IframeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
  @scala.inline
  implicit class IframeHTMLAttributesOps[Self <: IframeHTMLAttributes[_], T] (val x: Self with IframeHTMLAttributes[T]) extends AnyVal {
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
    def setAllow(value: String): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", js.undefined)
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", js.undefined)
    @scala.inline
    def setFrameBorder(value: Double | String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameBorder: Self = this.set("frameBorder", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImportance(value: low | auto | high): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setLoading(value: `lazy` | auto | eager): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMarginHeight(value: Double): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginHeight: Self = this.set("marginHeight", js.undefined)
    @scala.inline
    def setMarginWidth(value: Double): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginWidth: Self = this.set("marginWidth", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcDoc(value: String): Self = this.set("srcDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcDoc: Self = this.set("srcDoc", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

