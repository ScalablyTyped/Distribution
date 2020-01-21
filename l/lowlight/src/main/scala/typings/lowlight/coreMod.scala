package typings.lowlight

import typings.lowlight.lowlight.HighlightAutoOptions
import typings.lowlight.lowlight.HighlightAutoResult
import typings.lowlight.lowlight.HighlightOptions
import typings.lowlight.lowlight.HighlightResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lowlight/lib/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  def highlight(language: String, value: String): HighlightResult = js.native
  def highlight(language: String, value: String, options: HighlightOptions): HighlightResult = js.native
  def highlightAuto(value: String): HighlightAutoResult = js.native
  def highlightAuto(value: String, options: HighlightAutoOptions): HighlightAutoResult = js.native
  def registerLanguage(name: String, syntax: js.Function): Unit = js.native
}

