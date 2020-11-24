package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Nonterminal")
@js.native
class Nonterminal protected ()
  extends OptionalSymbolBase[typings.grammarkdown.grammarkdownMod.SyntaxKind.Nonterminal] {
  def this(name: Identifier) = this()
  def this(name: Identifier, argumentList: ArgumentList) = this()
  def this(name: Identifier, argumentList: js.UndefOr[scala.Nothing], questionToken: Token[QuestionToken]) = this()
  def this(name: Identifier, argumentList: ArgumentList, questionToken: Token[QuestionToken]) = this()
  
  val argumentList: js.UndefOr[ArgumentList] = js.native
  
  val name: Identifier = js.native
  
  def update(name: Identifier): Nonterminal = js.native
  def update(name: Identifier, argumentList: ArgumentList): Nonterminal = js.native
}
