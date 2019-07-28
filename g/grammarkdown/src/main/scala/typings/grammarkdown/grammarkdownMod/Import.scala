package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typings.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Import")
@js.native
class Import protected ()
  extends typings.grammarkdown.distNodesMod.Import {
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    importKeyword: typings.grammarkdown.distNodesMod.Token[ImportKeyword]
  ) = this()
  def this(
    atToken: typings.grammarkdown.distNodesMod.Token[AtToken],
    importKeyword: typings.grammarkdown.distNodesMod.Token[ImportKeyword],
    path: typings.grammarkdown.distNodesMod.StringLiteral
  ) = this()
}

