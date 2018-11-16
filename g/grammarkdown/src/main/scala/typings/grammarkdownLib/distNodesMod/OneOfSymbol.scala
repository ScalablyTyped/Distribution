package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "OneOfSymbol")
@js.native
class OneOfSymbol protected ()
  extends LexicalSymbolBase[grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], ofKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], ofKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], symbols: js.Array[LexicalSymbol]) = this()
  def this(oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], ofKeyword: js.UndefOr[scala.Nothing], symbols: js.Array[LexicalSymbol]) = this()
  val ofKeyword: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val oneKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
  val symbols: js.UndefOr[js.Array[LexicalSymbol]] = js.native
  def update(): OneOfSymbol = js.native
  def update(symbols: js.Array[LexicalSymbol]): OneOfSymbol = js.native
}

