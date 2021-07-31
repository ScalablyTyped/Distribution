package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import typings.grammarkdown.tokensMod.SyntaxKind.ImportKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Import")
@js.native
class Import protected ()
  extends typings.grammarkdown.nodesMod.Import {
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    importKeyword: typings.grammarkdown.nodesMod.Token[ImportKeyword]
  ) = this()
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    importKeyword: typings.grammarkdown.nodesMod.Token[ImportKeyword],
    path: typings.grammarkdown.nodesMod.StringLiteral
  ) = this()
}
