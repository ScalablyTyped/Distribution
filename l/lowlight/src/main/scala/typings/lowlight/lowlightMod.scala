package typings.lowlight

import typings.lowlight.lowlightNs.HighlightAutoOptions
import typings.lowlight.lowlightNs.HighlightAutoResult
import typings.lowlight.lowlightNs.HighlightOptions
import typings.lowlight.lowlightNs.HighlightResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lowlight", JSImport.Namespace)
@js.native
object lowlightMod extends js.Object {
  def highlight(language: String, value: String): HighlightResult = js.native
  def highlight(language: String, value: String, options: HighlightOptions): HighlightResult = js.native
  def highlightAuto(value: String): HighlightAutoResult = js.native
  def highlightAuto(value: String, options: HighlightAutoOptions): HighlightAutoResult = js.native
  def registerLanguage(name: String, syntax: js.Function): Unit = js.native
}

