package typings.htmlCodesniffer.mod.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.sRGBtoHSV")
@js.native
object sRGBtoHSV extends js.Object {
  
  /**
    * Convert an RGB colour into hue-saturation-value.
    *
    * This is used for calculations changing the colour (for colour contrast
    * purposes) to ensure that the hue is maintained.
    * The parameter accepts either a string (hex or rgb() format) or a
    * red/green/blue structure.
    * The returned structure has hue, saturation, and value components: the
    * latter two are in the range [0.0, 1.0]; hue is in degrees,
    * range [0.0, 360.0).
    * If there is no saturation then hue is technically undefined.
    *
    * @param colour A colour to convert.
    */
  def apply(colour: String): HsvColour = js.native
  def apply(colour: Colour): HsvColour = js.native
}
