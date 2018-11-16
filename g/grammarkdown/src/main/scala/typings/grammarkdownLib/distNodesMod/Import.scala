package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Import")
@js.native
class Import protected ()
  extends MetaElementBase[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], importKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], importKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], path: StringLiteral) = this()
  val importKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  val path: js.UndefOr[StringLiteral] = js.native
}

