package typings
package markdownlintLib.markdownlintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdownlint", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    options: markdownlintLib.markdownlintMod.markdownlintNs.MarkdownlintOptions,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ markdownlintLib.markdownlintMod.markdownlintNs.MarkdownlintResults, 
      _
    ]
  ): scala.Unit = js.native
  def readConfig(
    file: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ markdownlintLib.markdownlintMod.markdownlintNs.MarkdownlintConfig, 
      _
    ]
  ): scala.Unit = js.native
  def readConfigSync(file: java.lang.String): markdownlintLib.markdownlintMod.markdownlintNs.MarkdownlintConfig = js.native
  def sync(options: markdownlintLib.markdownlintMod.markdownlintNs.MarkdownlintOptions): markdownlintLib.markdownlintMod.markdownlintNs.MarkdownlintResults = js.native
}

