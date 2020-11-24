package typings.htmlCodesniffer.mod.Util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.contrastRatio")
@js.native
object contrastRatio extends js.Object {
  
  /**
    * Calculate the contrast ratio between two colours.
    *
    * Colours should be in rgb() or 3/6-digit hex format; order does not matter
    * (ie. it doesn't matter which is the lighter and which is the darker).
    * Values should be in the range [1.0, 21.0]... a ratio of 1.0 means "they're
    * exactly the same contrast", 21.0 means it's white-on-black or v.v.
    * Formula as per WCAG 2.0 definitions.
    *
    * @param colour1 The first colour to compare.
    * @param colour2 The second colour to compare.
    */
  def apply(colour1: String, colour2: String): Double = js.native
}
