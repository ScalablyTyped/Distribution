package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: grammarkdownLib.distNodesMod.AssertionKind */, TBracket /* <: grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketGreaterThanToken */] protected ()
  extends grammarkdownLib.distNodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: grammarkdownLib.distNodesMod.Token[TBracket]) = this()
  def this(kind: TKind, openBracketToken: grammarkdownLib.distNodesMod.Token[TBracket], closeBracketToken: grammarkdownLib.distNodesMod.Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
}

