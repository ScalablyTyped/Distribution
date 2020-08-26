package typings.jointjs.mod.dia.Element

import typings.jointjs.anon.Markup
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.MarkupJSON
import typings.jointjs.mod.dia.MarkupNodeJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortGroup extends js.Object {
  var attrs: js.UndefOr[Selectors] = js.native
  var label: js.UndefOr[Markup] = js.native
  var markup: js.UndefOr[String | MarkupJSON] = js.native
  var position: js.UndefOr[PositionType] = js.native
}

object PortGroup {
  @scala.inline
  def apply(): PortGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortGroup]
  }
  @scala.inline
  implicit class PortGroupOps[Self <: PortGroup] (val x: Self) extends AnyVal {
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
    def setAttrs(value: Selectors): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setLabel(value: Markup): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMarkupVarargs(value: MarkupNodeJSON*): Self = this.set("markup", js.Array(value :_*))
    @scala.inline
    def setMarkup(value: String | MarkupJSON): Self = this.set("markup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

