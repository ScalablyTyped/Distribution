package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.BooleanKind
import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typings.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Define")
@js.native
class Define protected ()
  extends typings.grammarkdown.distNodesMod.Define {
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    defineKeyword: typings.grammarkdown.distNodesMod.Token[DefineKeyword],
    key: typings.grammarkdown.distNodesMod.Identifier
  ) = this()
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    defineKeyword: typings.grammarkdown.distNodesMod.Token[DefineKeyword],
    key: typings.grammarkdown.distNodesMod.Identifier,
    valueToken: typings.grammarkdown.distNodesMod.Token[BooleanKind]
  ) = this()
}

