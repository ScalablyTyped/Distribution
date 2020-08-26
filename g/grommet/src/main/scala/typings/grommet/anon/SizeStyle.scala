package typings.grommet.anon

import typings.grommet.utilsMod.BoxSideType
import typings.grommet.utilsMod.BoxSizeType
import typings.grommet.utilsMod.BoxStyleType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod._BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeStyle extends _BorderType {
  var color: js.UndefOr[ColorType] = js.native
  var side: js.UndefOr[BoxSideType] = js.native
  var size: js.UndefOr[BoxSizeType] = js.native
  var style: js.UndefOr[BoxStyleType] = js.native
}

object SizeStyle {
  @scala.inline
  def apply(): SizeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeStyle]
  }
  @scala.inline
  implicit class SizeStyleOps[Self <: SizeStyle] (val x: Self) extends AnyVal {
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
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSide(value: BoxSideType): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setSize(value: BoxSizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: BoxStyleType): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

