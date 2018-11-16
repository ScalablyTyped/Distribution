package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Define")
@js.native
class Define protected ()
  extends MetaElementBase[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], defineKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], key: Identifier) = this()
  def this(atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], defineKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], key: Identifier, valueToken: Token[grammarkdownLib.distTokensMod.BooleanKind]) = this()
  val defineKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  val key: Identifier = js.native
  val valueToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.BooleanKind]] = js.native
}

