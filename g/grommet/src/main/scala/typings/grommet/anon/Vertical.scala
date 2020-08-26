package typings.grommet.anon

import typings.grommet.utilsMod.EdgeSizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vertical extends js.Object {
  var horizontal: js.UndefOr[EdgeSizeType] = js.native
  var vertical: js.UndefOr[EdgeSizeType] = js.native
}

object Vertical {
  @scala.inline
  def apply(): Vertical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertical]
  }
  @scala.inline
  implicit class VerticalOps[Self <: Vertical] (val x: Self) extends AnyVal {
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
    def setHorizontal(value: EdgeSizeType): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setVertical(value: EdgeSizeType): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

