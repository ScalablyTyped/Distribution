package typings.markdownToJsx.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-to-jsx", "compiler")
@js.native
object compiler extends js.Object {
  def apply(markdown: String): Element = js.native
  def apply(markdown: String, options: MarkdownOptions): Element = js.native
}

