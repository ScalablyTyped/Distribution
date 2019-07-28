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
  def readConfig(file: String, callback: js.Function2[/* err */ Error | Null, /* result */ MarkdownlintConfig, _]): Unit = js.native
  def readConfigSync(file: String): MarkdownlintConfig = js.native
  def sync(options: MarkdownlintOptions): MarkdownlintResults = js.native
}

