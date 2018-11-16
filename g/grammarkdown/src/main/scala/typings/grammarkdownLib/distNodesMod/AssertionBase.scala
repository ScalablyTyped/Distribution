package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: grammarkdownLib.distTokensMod.SyntaxKind */] protected () extends LexicalSymbolBase[TKind] {
  def this(kind: TKind, openBracketToken: Token[TBracket]) = this()
  def this(kind: TKind, openBracketToken: Token[TBracket], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val closeBracketToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
  val openBracketToken: Token[TBracket] = js.native
}

