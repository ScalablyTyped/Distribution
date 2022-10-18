package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.AssertionKind
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "AssertionBase")
@js.native
open class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected () extends LexicalSymbolBase[TKind] {
  def this(kind: TKind, openBracketToken: Token[TBracket]) = this()
  def this(kind: TKind, openBracketToken: Token[TBracket], closeBracketToken: Token[CloseBracketToken]) = this()
  
  val closeBracketToken: js.UndefOr[Token[CloseBracketToken]] = js.native
  
  val openBracketToken: Token[TBracket] = js.native
}
