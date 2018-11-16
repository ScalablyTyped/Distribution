package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "TokenHighlighter")
@js.native
class TokenHighlighter protected () extends js.Object {
  def this(opt_indexStrategy: IIndexStrategy, opt_sanitizer: ISanitizer, opt_wrapperTagName: java.lang.String) = this()
  def highlight(text: java.lang.String, tokens: js.Array[java.lang.String]): java.lang.String = js.native
}

