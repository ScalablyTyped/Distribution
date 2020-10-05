package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanInsideOptions extends js.Object {
  var padding: js.UndefOr[PointExpression] = js.native
  var paddingBottomRight: js.UndefOr[PointExpression] = js.native
  var paddingTopLeft: js.UndefOr[PointExpression] = js.native
}

object PanInsideOptions {
  @scala.inline
  def apply(): PanInsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanInsideOptions]
  }
  @scala.inline
  implicit class PanInsideOptionsOps[Self <: PanInsideOptions] (val x: Self) extends AnyVal {
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
    def setPadding(value: PointExpression): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingBottomRight(value: PointExpression): Self = this.set("paddingBottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottomRight: Self = this.set("paddingBottomRight", js.undefined)
    @scala.inline
    def setPaddingTopLeft(value: PointExpression): Self = this.set("paddingTopLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTopLeft: Self = this.set("paddingTopLeft", js.undefined)
  }
  
}

