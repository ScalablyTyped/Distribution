package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ParameterList")
@js.native
class ParameterList protected ()
  extends grammarkdownLib.distNodesMod.ParameterList {
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ]) = this()
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[grammarkdownLib.distNodesMod.Parameter]) = this()
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.UndefOr[scala.Nothing], closeParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
  def this(openParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.OpenParenToken | grammarkdownLib.distTokensMod.SyntaxKind.OpenBracketToken
    ], elements: js.Array[grammarkdownLib.distNodesMod.Parameter], closeParenToken: grammarkdownLib.distNodesMod.Token[
      grammarkdownLib.distTokensMod.SyntaxKind.CloseParenToken | grammarkdownLib.distTokensMod.SyntaxKind.CloseBracketToken
    ]) = this()
}

