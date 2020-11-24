package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "PlaceholderSymbol")
@js.native
class PlaceholderSymbol protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol]
     with _LexicalSymbol {
  def this(placeholderToken: Token[AtToken]) = this()
  
  val placeholderToken: Token[AtToken] = js.native
}
