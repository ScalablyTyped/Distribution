package typings.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@markedjs/html-differ", "HtmlDiffer")
@js.native
class HtmlDiffer () extends js.Object {
  def this(options: Options) = this()
  def this(preset: CustomPreset) = this()
  def this(preset: Preset) = this()
  
  def diffHtml(html1: String, html2: String): js.Array[ChangeObject] = js.native
  
  def isEqual(html1: String, html2: String): Boolean = js.native
}
