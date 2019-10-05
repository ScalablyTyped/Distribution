package typings.markdownlint.markdownlintMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdownlint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    options: MarkdownlintOptions,
    callback: js.Function2[/* err */ Error | Null, /* result */ MarkdownlintResults, _]
  ): Unit = js.native
}

