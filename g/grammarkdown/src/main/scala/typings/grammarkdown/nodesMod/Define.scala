package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.BooleanKind
import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import typings.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword
import typings.grammarkdown.tokensMod.SyntaxKind.DefineKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Define")
@js.native
class Define protected ()
  extends MetaElementBase[typings.grammarkdown.tokensMod.SyntaxKind.Define]
     with MetaElement {
  def this(atToken: Token[AtToken], defineKeyword: Token[DefineKeyword], key: Identifier) = this()
  def this(
    atToken: Token[AtToken],
    defineKeyword: Token[DefineKeyword],
    key: Identifier,
    valueToken: Token[BooleanKind | DefaultKeyword]
  ) = this()
  
  val defineKeyword: Token[DefineKeyword] = js.native
  
  val key: Identifier = js.native
  
  val valueToken: js.UndefOr[Token[BooleanKind | DefaultKeyword]] = js.native
}
