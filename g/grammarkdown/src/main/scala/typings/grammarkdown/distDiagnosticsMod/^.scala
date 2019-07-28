package typings.grammarkdown.distDiagnosticsMod

import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/diagnostics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatList(tokens: js.Array[SyntaxKind | String]): String = js.native
  def formatString(format: String): String = js.native
  def formatString(format: String, args: js.Any*): String = js.native
  def formatString(format: String, args: js.Array[_]): String = js.native
}

