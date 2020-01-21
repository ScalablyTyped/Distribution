package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.BooleanKind
import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import typings.grammarkdown.tokensMod.SyntaxKind.DefineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Define")
@js.native
class Define protected ()
  extends MetaElementBase[typings.grammarkdown.tokensMod.SyntaxKind.Define] {
  def this(atToken: Token[AtToken], defineKeyword: Token[DefineKeyword], key: Identifier) = this()
  def this(
    atToken: Token[AtToken],
    defineKeyword: Token[DefineKeyword],
    key: Identifier,
    valueToken: Token[BooleanKind]
  ) = this()
  val defineKeyword: Token[DefineKeyword] = js.native
  val key: Identifier = js.native
  val valueToken: js.UndefOr[Token[BooleanKind]] = js.native
}

