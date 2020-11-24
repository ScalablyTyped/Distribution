package typings.htmlCodesniffer.mod.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.HSVtosRGB")
@js.native
object HSVtosRGB extends js.Object {
  
  /**
    * Convert a hue-saturation-value structure into an RGB structure.
    *
    * The hue element should be a degree value in the region of [0.0, 360.0).
    * The saturation and value elements should be in the range [0.0, 1.0].
    * Use RGBtoColourStr to convert back into a hex colour.
    *
    * @param hsvColour A HSV structure to convert.
    */
  def apply(hsvColour: HsvColour): Colour = js.native
}
