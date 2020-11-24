package typings.icssUtils.mod

import typings.postcss.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("icss-utils", "extractICSS")
@js.native
object extractICSS extends js.Object {
  
  def apply(css: Container): ExtractedICSS = js.native
  def apply(css: Container, removeRules: Boolean): ExtractedICSS = js.native
}
