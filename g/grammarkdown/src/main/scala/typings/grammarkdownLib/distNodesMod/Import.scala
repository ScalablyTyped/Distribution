package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Import")
@js.native
class Import protected ()
  extends MetaElementBase[grammarkdownLib.distTokensMod.SyntaxKind.Import] {
  def this(atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.AtToken], importKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.ImportKeyword]) = this()
  def this(atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.AtToken], importKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.ImportKeyword], path: StringLiteral) = this()
  val importKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.ImportKeyword] = js.native
  val path: js.UndefOr[StringLiteral] = js.native
}

