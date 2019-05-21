package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "Terminal")
@js.native
class Terminal ()
  extends OptionalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind]
     with TextContent {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, questionToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(text: js.UndefOr[scala.Nothing], questionToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
}

