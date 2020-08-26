package typings.grommet.anon

import typings.grommet.utilsMod.BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panel extends js.Object {
  var border: js.UndefOr[BorderType] = js.native
  var heading: js.UndefOr[Level] = js.native
  var hover: js.UndefOr[Heading] = js.native
  var icons: js.UndefOr[Collapse] = js.native
  var panel: js.UndefOr[`2`] = js.native
}

object Panel {
  @scala.inline
  def apply(): Panel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Panel]
  }
  @scala.inline
  implicit class PanelOps[Self <: Panel] (val x: Self) extends AnyVal {
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
    def setBorderVarargs(value: SizeStyle*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: BorderType): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setHeading(value: Level): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setHover(value: Heading): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setIcons(value: Collapse): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setPanel(value: `2`): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
  }
  
}

