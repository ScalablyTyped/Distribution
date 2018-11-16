package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterLiteral")
@js.native
class UnicodeCharacterLiteral ()
  extends OptionalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind]
     with TextContent {
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, questionToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(text: js.UndefOr[scala.Nothing], questionToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  /* CompleteClass */
  override var text: js.UndefOr[java.lang.String] = js.native
}

