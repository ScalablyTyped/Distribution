package typings.linguiReact.renderMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var render: js.UndefOr[ReactNode] = js.native
}

object RenderProps {
  @scala.inline
  def apply(): RenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderProps]
  }
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setRender(value: ReactNode): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

