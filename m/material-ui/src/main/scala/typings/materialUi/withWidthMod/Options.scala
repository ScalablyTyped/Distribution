package typings.materialUi.withWidthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  var largeWidth: js.UndefOr[Double] = js.native
  var mediumWidth: js.UndefOr[Double] = js.native
  var resizeInterval: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setLargeWidth(value: Double): Self = this.set("largeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeWidth: Self = this.set("largeWidth", js.undefined)
    @scala.inline
    def setMediumWidth(value: Double): Self = this.set("mediumWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediumWidth: Self = this.set("mediumWidth", js.undefined)
    @scala.inline
    def setResizeInterval(value: Double): Self = this.set("resizeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeInterval: Self = this.set("resizeInterval", js.undefined)
  }
  
}

