package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "InvalidAssertion")
@js.native
class InvalidAssertion protected ()
  extends AssertionBase[
      grammarkdownLib.distTokensMod.SyntaxKind.InvalidAssertion, 
      grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken]) = this()
}

