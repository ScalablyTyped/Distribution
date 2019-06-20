package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "StringLiteral")
@js.native
class StringLiteral ()
  extends Node[grammarkdownLib.distTokensMod.SyntaxKind.StringLiteral]
     with TextContent {
  def this(text: java.lang.String) = this()
}

