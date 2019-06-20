package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends grammarkdownLib.distNodesMod.ArgumentList {
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ]) = this()
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[grammarkdownLib.distNodesMod.Argument]) = this()
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.UndefOr[scala.Nothing], closeParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[grammarkdownLib.distNodesMod.Argument], closeParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
}

