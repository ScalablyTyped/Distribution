package typings
package lowlightLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lowlight", JSImport.Namespace)
@js.native
object lowlightMod extends js.Object {
  def highlight(language: java.lang.String, value: java.lang.String): lowlightLib.lowlightNs.HighlightResult = js.native
  def highlight(
    language: java.lang.String,
    value: java.lang.String,
    options: lowlightLib.lowlightNs.HighlightOptions
  ): lowlightLib.lowlightNs.HighlightResult = js.native
  def highlightAuto(value: java.lang.String): lowlightLib.lowlightNs.HighlightAutoResult = js.native
  def highlightAuto(value: java.lang.String, options: lowlightLib.lowlightNs.HighlightAutoOptions): lowlightLib.lowlightNs.HighlightAutoResult = js.native
  def registerLanguage(name: java.lang.String, syntax: js.Function): scala.Unit = js.native
}

