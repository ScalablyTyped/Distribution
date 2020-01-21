package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foundation extends js.Object {
  var base: Base
  var palette: Palette
}

object Foundation {
  @scala.inline
  def apply(base: Base, palette: Palette): Foundation = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Foundation]
  }
}

