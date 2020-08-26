package typings.luminoVirtualdom.anon

import typings.luminoVirtualdom.mod.ElementAttrs
import typings.luminoVirtualdom.mod.VirtualNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attrs extends js.Object {
  var attrs: js.UndefOr[ElementAttrs] = js.native
  var children: js.UndefOr[js.Array[VirtualNode]] = js.native
}

object Attrs {
  @scala.inline
  def apply(): Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attrs]
  }
  @scala.inline
  implicit class AttrsOps[Self <: Attrs] (val x: Self) extends AnyVal {
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
    def setAttrs(value: ElementAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: VirtualNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VirtualNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

