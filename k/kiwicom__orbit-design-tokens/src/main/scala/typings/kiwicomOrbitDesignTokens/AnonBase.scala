package typings.kiwicomOrbitDesignTokens

import typings.kiwicomOrbitDesignTokens.mod.CustomBase
import typings.kiwicomOrbitDesignTokens.mod.CustomPalette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends js.Object {
  var base: CustomBase
  var palette: CustomPalette
}

object AnonBase {
  @scala.inline
  def apply(base: CustomBase, palette: CustomPalette): AnonBase = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase]
  }
}

