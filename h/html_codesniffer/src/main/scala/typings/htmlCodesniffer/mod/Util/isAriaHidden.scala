package typings.htmlCodesniffer.mod.Util

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.isAriaHidden")
@js.native
object isAriaHidden extends js.Object {
  
  /**
    * Returns true if the element is deliberately hidden from Accessibility APIs using ARIA hidden.
    *
    * Not: This is separate to isAccessibilityHidden() due to a need to check specifically for aria hidden.
    *
    * @param element The element to check.
    */
  def apply(element: Element): Boolean = js.native
}
