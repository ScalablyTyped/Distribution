package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Large extends js.Object {
  var large: js.UndefOr[Size] = js.native
  var medium: js.UndefOr[Size] = js.native
  var small: js.UndefOr[Size] = js.native
  var xlarge: js.UndefOr[Size] = js.native
  var xsmall: js.UndefOr[Size] = js.native
  var xxlarge: js.UndefOr[Size] = js.native
}

object Large {
  @scala.inline
  def apply(): Large = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Large]
  }
  @scala.inline
  implicit class LargeOps[Self <: Large] (val x: Self) extends AnyVal {
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
    def setLarge(value: Size): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    @scala.inline
    def setMedium(value: Size): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    @scala.inline
    def setSmall(value: Size): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    @scala.inline
    def setXlarge(value: Size): Self = this.set("xlarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlarge: Self = this.set("xlarge", js.undefined)
    @scala.inline
    def setXsmall(value: Size): Self = this.set("xsmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsmall: Self = this.set("xsmall", js.undefined)
    @scala.inline
    def setXxlarge(value: Size): Self = this.set("xxlarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXxlarge: Self = this.set("xxlarge", js.undefined)
  }
  
}

