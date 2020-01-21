package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.AtToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "PlaceholderSymbol")
@js.native
class PlaceholderSymbol protected ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.PlaceholderSymbol] {
  def this(placeholderToken: Token[AtToken]) = this()
  val placeholderToken: Token[AtToken] = js.native
}

