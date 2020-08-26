package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upper extends js.Object {
  var color: js.UndefOr[js.Any] = js.native
  var extend: js.UndefOr[ExtendType] = js.native
  var height: js.UndefOr[String] = js.native
  var lower: js.UndefOr[`5`] = js.native
  var opacity: js.UndefOr[OpacityType] = js.native
  var upper: js.UndefOr[`5`] = js.native
}

object Upper {
  @scala.inline
  def apply(): Upper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upper]
  }
  @scala.inline
  implicit class UpperOps[Self <: Upper] (val x: Self) extends AnyVal {
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
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setExtendFunction1(value: /* args */ js.Any => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: ExtendType): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLower(value: `5`): Self = this.set("lower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLower: Self = this.set("lower", js.undefined)
    @scala.inline
    def setOpacity(value: OpacityType): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setUpper(value: `5`): Self = this.set("upper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpper: Self = this.set("upper", js.undefined)
  }
  
}

