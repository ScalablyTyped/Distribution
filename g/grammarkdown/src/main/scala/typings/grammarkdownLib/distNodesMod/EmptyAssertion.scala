package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends AssertionBase[
      grammarkdownLib.distTokensMod.SyntaxKind.EmptyAssertion, 
      grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], emptyKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.EmptyKeyword]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], emptyKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.EmptyKeyword], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
  val emptyKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind.EmptyKeyword] = js.native
}

