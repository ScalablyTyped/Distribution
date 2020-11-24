package typings.htmlCodesniffer.mod.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.relativeLum")
@js.native
object relativeLum extends js.Object {
  
  /**
    * Calculate relative luminescence for a colour in the sRGB colour profile.
    *
    * Supports rgb() and hex colours. rgba() also supported but the alpha
    * channel is currently ignored.
    * Hex colours can have an optional "#" at the front, which is stripped.
    * Relative luminescence formula is defined in the definitions of WCAG 2.0.
    * It can be either three or six hex digits, as per CSS conventions.
    * It should return a value in the range [0.0, 1.0].
    *
    * @param colour The colour to calculate from.
    */
  def apply(colour: String): Double = js.native
}
