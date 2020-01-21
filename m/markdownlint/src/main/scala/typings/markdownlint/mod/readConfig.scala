package typings.markdownlint.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdownlint", "readConfig")
@js.native
object readConfig extends js.Object {
  def apply(file: String, callback: js.Function2[/* err */ Error | Null, /* result */ MarkdownlintConfig, _]): Unit = js.native
}

