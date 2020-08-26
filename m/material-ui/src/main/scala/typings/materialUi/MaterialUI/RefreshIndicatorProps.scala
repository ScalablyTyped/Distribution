package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.hide
import typings.materialUi.materialUiStrings.loading
import typings.materialUi.materialUiStrings.ready
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshIndicatorProps extends js.Object {
  var color: js.UndefOr[String] = js.native
  var left: Double = js.native
  var loadingColor: js.UndefOr[String] = js.native
  var percentage: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var status: js.UndefOr[ready | loading | hide] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var top: Double = js.native
}

object RefreshIndicatorProps {
  @scala.inline
  def apply(left: Double, top: Double): RefreshIndicatorProps = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshIndicatorProps]
  }
  @scala.inline
  implicit class RefreshIndicatorPropsOps[Self <: RefreshIndicatorProps] (val x: Self) extends AnyVal {
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
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLoadingColor(value: String): Self = this.set("loadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingColor: Self = this.set("loadingColor", js.undefined)
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStatus(value: ready | loading | hide): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

