package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken */] protected () extends LexicalSymbolBase[TKind] {
  def this(kind: TKind, openBracketToken: Token[TBracket]) = this()
  def this(kind: TKind, openBracketToken: Token[TBracket], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  val closeBracketToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]] = js.native
  val openBracketToken: Token[TBracket] = js.native
}

