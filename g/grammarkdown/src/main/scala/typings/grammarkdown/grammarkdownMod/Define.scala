package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.AtToken
import typings.grammarkdown.grammarkdownMod.SyntaxKind.DefineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Define")
@js.native
class Define protected ()
  extends MetaElementBase[typings.grammarkdown.grammarkdownMod.SyntaxKind.Define] {
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
