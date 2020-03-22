package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  palette  :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomPalette,   base  :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomBase}> */
trait CustomFoundation extends js.Object {
  var base: js.UndefOr[CustomBase] = js.undefined
  var palette: js.UndefOr[CustomPalette] = js.undefined
}

object CustomFoundation {
  @scala.inline
  def apply(base: CustomBase = null, palette: CustomPalette = null): CustomFoundation = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFoundation]
  }
}

