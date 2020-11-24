package typings.htmlCodesniffer.mod.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.RGBtoColourStr")
@js.native
object RGBtoColourStr extends js.Object {
  
  /**
    * Convert an RGB colour structure to a hex colour.
    *
    * The red/green/blue colour elements should be on a [0.0, 1.0] scale.
    * Colours that can be converted into a three Hex-digit string will be
    * converted as such (eg. rgb(34,34,34) => #222). Others will be converted
    * to a six-digit string (eg. rgb(48,48,48) => #303030).
    *
    * @param colour Structure with "red", "green" and "blue" elements.
    */
  def apply(colou: Colour): String = js.native
}
