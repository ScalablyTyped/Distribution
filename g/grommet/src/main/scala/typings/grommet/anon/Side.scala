package typings.grommet.anon

import typings.grommet.listMod.SideType
import typings.grommet.listMod.SizeType
import typings.grommet.listMod._BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Side extends _BorderType {
  var color: js.UndefOr[String | Dark] = js.native
  var side: js.UndefOr[SideType] = js.native
  var size: js.UndefOr[SizeType] = js.native
}

object Side {
  @scala.inline
  def apply(): Side = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Side]
  }
  @scala.inline
  implicit class SideOps[Self <: Side] (val x: Self) extends AnyVal {
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
    def setColor(value: String | Dark): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSide(value: SideType): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

