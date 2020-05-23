package typings.jqueryHighlightBartaz

import typings.jqueryHighlightBartaz.anon.CaseSensitive
import typings.jqueryHighlightBartaz.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def highlight(words: String): JQuery = js.native
  def highlight(words: String, options: CaseSensitive): JQuery = js.native
  def highlight(words: js.Array[String]): JQuery = js.native
  def highlight(words: js.Array[String], options: CaseSensitive): JQuery = js.native
  def unhighlight(): JQuery = js.native
  def unhighlight(options: ClassName): JQuery = js.native
}

