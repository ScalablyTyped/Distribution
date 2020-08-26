package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  palette :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomPalette,   base :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomBase}> */
@js.native
trait CustomFoundation extends js.Object {
  var base: js.UndefOr[CustomBase] = js.native
  var palette: js.UndefOr[CustomPalette] = js.native
}

object CustomFoundation {
  @scala.inline
  def apply(): CustomFoundation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFoundation]
  }
  @scala.inline
  implicit class CustomFoundationOps[Self <: CustomFoundation] (val x: Self) extends AnyVal {
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
    def setBase(value: CustomBase): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setPalette(value: CustomPalette): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
  }
  
}

