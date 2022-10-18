package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typings.grammarkdown.distTokensMod.SyntaxKind.ImportKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Import")
@js.native
open class Import protected ()
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
