package typings
package icssDashUtilsLib.icssDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtractedICSS extends js.Object {
  var icssExports: CSSExports
  var icssImports: CSSImports
}

object ExtractedICSS {
  @scala.inline
  def apply(icssExports: CSSExports, icssImports: CSSImports): ExtractedICSS = {
    val __obj = js.Dynamic.literal(icssExports = icssExports, icssImports = icssImports)
  
    __obj.asInstanceOf[ExtractedICSS]
  }
}

