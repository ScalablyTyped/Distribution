package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends LexicalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind.OneOfSymbol] {
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.OneKeyword]) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.OneKeyword], ofKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.OfKeyword]) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.OneKeyword], ofKeyword: js.UndefOr[scala.Nothing], symbols: js.Array[LexicalSymbol]) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.OneKeyword], ofKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.OfKeyword], symbols: js.Array[LexicalSymbol]) = this()
  val ofKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind.OfKeyword]] = js.native
  val oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.OneKeyword] = js.native
  val symbols: js.UndefOr[js.Array[LexicalSymbol]] = js.native
  def update(): OneOfSymbol = js.native
  def update(symbols: js.Array[LexicalSymbol]): OneOfSymbol = js.native
}

