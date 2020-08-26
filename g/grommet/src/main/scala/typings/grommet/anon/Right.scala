package typings.grommet.anon

import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Right extends js.Object {
  var bottom: js.UndefOr[top | typings.grommet.grommetStrings.bottom] = js.native
  var left: js.UndefOr[right | typings.grommet.grommetStrings.left] = js.native
  var right: js.UndefOr[typings.grommet.grommetStrings.right | left] = js.native
  var top: js.UndefOr[typings.grommet.grommetStrings.top | bottom] = js.native
}

object Right {
  @scala.inline
  def apply(): Right = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Right]
  }
  @scala.inline
  implicit class RightOps[Self <: Right] (val x: Self) extends AnyVal {
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
    def setBottom(value: top | bottom): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: right | left): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: right | left): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: top | bottom): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

