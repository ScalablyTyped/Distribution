package typings.jointjs.mod.dia.ToolsView

import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.ToolView
import typings.jointjs.mod.mvc.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends ViewOptions[js.UndefOr[scala.Nothing]] {
  var component: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String | Null] = js.native
  var relatedView: js.UndefOr[CellView] = js.native
  var tools: js.UndefOr[js.Array[ToolView]] = js.native
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
    def setComponent(value: Boolean): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setRelatedView(value: CellView): Self = this.set("relatedView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedView: Self = this.set("relatedView", js.undefined)
    @scala.inline
    def setToolsVarargs(value: ToolView*): Self = this.set("tools", js.Array(value :_*))
    @scala.inline
    def setTools(value: js.Array[ToolView]): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
  
}

