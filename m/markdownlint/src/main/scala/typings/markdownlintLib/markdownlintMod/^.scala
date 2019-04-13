package typings
package markdownlintLib.markdownlintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdownlint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    options: MarkdownlintOptions,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ MarkdownlintResults, _]
  ): scala.Unit = js.native
  def readConfig(
    file: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ MarkdownlintConfig, _]
  ): scala.Unit = js.native
  def readConfigSync(file: java.lang.String): MarkdownlintConfig = js.native
  def sync(options: MarkdownlintOptions): MarkdownlintResults = js.native
}

