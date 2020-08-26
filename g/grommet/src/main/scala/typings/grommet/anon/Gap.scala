package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.GapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gap extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.native
  var extend: js.UndefOr[ExtendType] = js.native
  var gap: js.UndefOr[GapType] = js.native
  var header: js.UndefOr[BorderExtend] = js.native
  var panel: js.UndefOr[`10`] = js.native
}

object Gap {
  @scala.inline
  def apply(): Gap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gap]
  }
  @scala.inline
  implicit class GapOps[Self <: Gap] (val x: Self) extends AnyVal {
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
    def setBackground(value: BackgroundType): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setExtendFunction1(value: /* args */ js.Any => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setExtend(value: ExtendType): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setGap(value: GapType): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setHeader(value: BorderExtend): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setPanel(value: `10`): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
  }
  
}

