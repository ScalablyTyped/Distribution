package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.BooleanKind
import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import typings.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.DefineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Define")
@js.native
class Define protected ()
  extends typings.grammarkdown.nodesMod.Define {
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    defineKeyword: typings.grammarkdown.nodesMod.Token[DefineKeyword],
    key: typings.grammarkdown.nodesMod.Identifier
  ) = this()
  def this(
    atToken: typings.grammarkdown.nodesMod.Token[AtToken],
    defineKeyword: typings.grammarkdown.nodesMod.Token[DefineKeyword],
    key: typings.grammarkdown.nodesMod.Identifier,
    valueToken: typings.grammarkdown.nodesMod.Token[BooleanKind | DefaultKeyword]
  ) = this()
}
