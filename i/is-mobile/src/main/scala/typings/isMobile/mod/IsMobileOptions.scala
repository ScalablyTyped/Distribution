package typings.isMobile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMobileOptions extends js.Object {
  var featureDetect: js.UndefOr[Boolean] = js.native
  var tablet: js.UndefOr[Boolean] = js.native
  var ua: js.UndefOr[String | HttpRequestInterfaceMock] = js.native
}

object IsMobileOptions {
  @scala.inline
  def apply(): IsMobileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMobileOptions]
  }
  @scala.inline
  implicit class IsMobileOptionsOps[Self <: IsMobileOptions] (val x: Self) extends AnyVal {
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
    def setFeatureDetect(value: Boolean): Self = this.set("featureDetect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureDetect: Self = this.set("featureDetect", js.undefined)
    @scala.inline
    def setTablet(value: Boolean): Self = this.set("tablet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTablet: Self = this.set("tablet", js.undefined)
    @scala.inline
    def setUa(value: String | HttpRequestInterfaceMock): Self = this.set("ua", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUa: Self = this.set("ua", js.undefined)
  }
  
}

