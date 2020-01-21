package typings.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "TokenHighlighter")
@js.native
class TokenHighlighter protected () extends js.Object {
  def this(opt_indexStrategy: IIndexStrategy, opt_sanitizer: ISanitizer, opt_wrapperTagName: String) = this()
  def highlight(text: String, tokens: js.Array[String]): String = js.native
}

