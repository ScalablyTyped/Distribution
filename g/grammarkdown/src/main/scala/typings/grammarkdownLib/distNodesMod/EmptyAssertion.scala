package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends AssertionBase[grammarkdownLib.distTokensMod.SyntaxKind, grammarkdownLib.distTokensMod.SyntaxKind] {
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], emptyKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  def this(openBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind], emptyKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind], closeBracketToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val emptyKeyword: Token[grammarkdownLib.distTokensMod.SyntaxKind] = js.native
}

