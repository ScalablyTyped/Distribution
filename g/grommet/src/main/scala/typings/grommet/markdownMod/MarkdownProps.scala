package typings.grommet.markdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownProps extends js.Object {
  var components: js.UndefOr[js.Object] = js.native
}

object MarkdownProps {
  @scala.inline
  def apply(): MarkdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownProps]
  }
  @scala.inline
  implicit class MarkdownPropsOps[Self <: MarkdownProps] (val x: Self) extends AnyVal {
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
    def setComponents(value: js.Object): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
  }
  
}

