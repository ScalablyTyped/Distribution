package typings.jointjs.mod.dia.Element

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.anon.Markup
import typings.jointjs.jointjsStrings.auto
import typings.jointjs.mod.dia.Cell.Selectors
import typings.jointjs.mod.dia.MarkupJSON
import typings.jointjs.mod.dia.MarkupNodeJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Port extends js.Object {
  var args: js.UndefOr[StringDictionary[js.Any]] = js.native
  var attrs: js.UndefOr[Selectors] = js.native
  var group: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[Markup] = js.native
  var markup: js.UndefOr[String | MarkupJSON] = js.native
  var z: js.UndefOr[Double | auto] = js.native
}

object Port {
  @scala.inline
  def apply(): Port = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Port]
  }
  @scala.inline
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
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
    def setArgs(value: StringDictionary[js.Any]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setAttrs(value: Selectors): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
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
    def setZ(value: Double | auto): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
  
}

