package typings.htmlCodesniffer.mod.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.colourStrToRGB")
@js.native
object colourStrToRGB extends js.Object {
  
  /**
    * Convert a colour string to a structure with red/green/blue/alpha elements.
    *
    * Supports rgb() and hex colours (3, 4, 6 or 8 hex digits, optional "#").
    * Each red/green/blue element is in the range [0.0, 1.0].
    *
    * @param colour The colour to convert.
    */
  def apply(colour: String): Colour = js.native
}
