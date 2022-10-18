package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.AssertionKind
import typings.grammarkdown.distTokensMod.SyntaxKind.CloseBracketToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typings.grammarkdown.distTokensMod.SyntaxKind.OpenBracketToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "AssertionBase")
@js.native
open class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected ()
  extends typings.grammarkdown.distNodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: typings.grammarkdown.distNodesMod.Token[TBracket]) = this()
  def this(
    kind: TKind,
    openBracketToken: typings.grammarkdown.distNodesMod.Token[TBracket],
    closeBracketToken: typings.grammarkdown.distNodesMod.Token[CloseBracketToken]
  ) = this()
}
