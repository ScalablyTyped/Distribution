package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupEnd extends js.Object {
  var groupEnd: js.UndefOr[`12`] = js.native
  var groupHeader: js.UndefOr[Fill] = js.native
  var header: js.UndefOr[js.Object] = js.native
  var icons: js.UndefOr[Ascending] = js.native
  var primary: js.UndefOr[`14`] = js.native
  var resize: js.UndefOr[`13`] = js.native
}

object GroupEnd {
  @scala.inline
  def apply(): GroupEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupEnd]
  }
  @scala.inline
  implicit class GroupEndOps[Self <: GroupEnd] (val x: Self) extends AnyVal {
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
    def setGroupEnd(value: `12`): Self = this.set("groupEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupEnd: Self = this.set("groupEnd", js.undefined)
    @scala.inline
    def setGroupHeader(value: Fill): Self = this.set("groupHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHeader: Self = this.set("groupHeader", js.undefined)
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setIcons(value: Ascending): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setPrimary(value: `14`): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setResize(value: `13`): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
  }
  
}

