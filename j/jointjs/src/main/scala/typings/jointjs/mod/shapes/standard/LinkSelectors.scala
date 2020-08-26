package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGPathAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkSelectors extends js.Object {
  var line: js.UndefOr[SVGPathAttributes] = js.native
  var root: js.UndefOr[SVGAttributes] = js.native
  var wrapper: js.UndefOr[SVGPathAttributes] = js.native
}

object LinkSelectors {
  @scala.inline
  def apply(): LinkSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkSelectors]
  }
  @scala.inline
  implicit class LinkSelectorsOps[Self <: LinkSelectors] (val x: Self) extends AnyVal {
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
    def setLine(value: SVGPathAttributes): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setRoot(value: SVGAttributes): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setWrapper(value: SVGPathAttributes): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

