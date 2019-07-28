package typings.grammarkdown.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Identifier")
@js.native
class Identifier ()
  extends Node[typings.grammarkdown.distTokensMod.SyntaxKind.Identifier]
     with TextContent {
  def this(text: String) = this()
}

