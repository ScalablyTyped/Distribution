package typings.grammarkdown.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "StringLiteral")
@js.native
class StringLiteral ()
  extends Node[typings.grammarkdown.tokensMod.SyntaxKind.StringLiteral]
     with TextContent {
  def this(text: String) = this()
}

