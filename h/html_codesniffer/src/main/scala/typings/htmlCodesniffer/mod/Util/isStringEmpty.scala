package typings.htmlCodesniffer.mod.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.isStringEmpty")
@js.native
object isStringEmpty extends js.Object {
  
  /**
    * Returns true if the string is "empty" according to WCAG standards.
    *
    * We can test for whether the string is entirely composed of whitespace, but
    * WCAG standards explicitly state that non-breaking spaces (&nbsp;, &#160;)
    * are not considered "empty". So we need this function to filter out that
    * situation.
    *
    * @param string The potentially empty string.
    */
  def apply(string: String): Boolean = js.native
}
