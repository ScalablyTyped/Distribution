package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "tokenToString")
@js.native
object tokenToString extends js.Object {
  def apply(kind: String): String = js.native
  def apply(kind: String, quoted: Boolean): String = js.native
  def apply(kind: SyntaxKind): String = js.native
  def apply(kind: SyntaxKind, quoted: Boolean): String = js.native
}

