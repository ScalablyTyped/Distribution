package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "PlaceholderSymbol")
@js.native
class PlaceholderSymbol protected ()
  extends Node2[typings.grammarkdown.grammarkdownMod.SyntaxKind.PlaceholderSymbol] {
  def this(placeholderToken: Token[AtToken]) = this()
  
  val placeholderToken: Token[AtToken] = js.native
}
