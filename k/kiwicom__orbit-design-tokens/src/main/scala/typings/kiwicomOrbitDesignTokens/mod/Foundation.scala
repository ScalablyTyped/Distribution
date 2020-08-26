package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Foundation extends js.Object {
  var base: Base = js.native
  var palette: Palette = js.native
}

object Foundation {
  @scala.inline
  def apply(base: Base, palette: Palette): Foundation = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[Foundation]
  }
  @scala.inline
  implicit class FoundationOps[Self <: Foundation] (val x: Self) extends AnyVal {
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
    def setBase(value: Base): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setPalette(value: Palette): Self = this.set("palette", value.asInstanceOf[js.Any])
  }
  
}

