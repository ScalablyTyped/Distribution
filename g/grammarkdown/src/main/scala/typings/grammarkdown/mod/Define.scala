package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.BooleanKind
import typings.grammarkdown.distTokensMod.SyntaxKind.AtToken
import typings.grammarkdown.distTokensMod.SyntaxKind.DefaultKeyword
import typings.grammarkdown.distTokensMod.SyntaxKind.DefineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Define")
@js.native
open class Define protected ()
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
    valueToken: typings.grammarkdown.distNodesMod.Token[BooleanKind | DefaultKeyword]
  ) = this()
}
