package typings.htmlCodesniffer.mod.Util

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.isVisuallyHidden")
@js.native
object isVisuallyHidden extends js.Object {
  
  /**
    * Return true if an element is hidden visually.
    *
    * If the computed style of an element cannot be determined for some reason,
    * it is presumed it is NOT hidden.
    *
    * @param element The element that is hiding, or not.
    */
  def apply(element: Element): Boolean = js.native
}
