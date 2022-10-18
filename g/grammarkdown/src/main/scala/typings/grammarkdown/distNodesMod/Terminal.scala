package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "Terminal")
@js.native
open class Terminal protected ()
  extends OptionalSymbolBase[typings.grammarkdown.distTokensMod.SyntaxKind.Terminal]
     with OptionalSymbol
     with _ProseFragment {
  def this(literal: TerminalLiteral) = this()
  def this(literal: UnicodeCharacterLiteral) = this()
  def this(literal: TerminalLiteral, questionToken: Token[QuestionToken]) = this()
  def this(literal: UnicodeCharacterLiteral, questionToken: Token[QuestionToken]) = this()
  
  val literal: UnicodeCharacterLiteral | TerminalLiteral = js.native
  
  def update(literal: TerminalLiteral): Terminal = js.native
  def update(literal: TerminalLiteral, questionToken: Token[QuestionToken]): Terminal = js.native
  def update(literal: UnicodeCharacterLiteral): Terminal = js.native
  def update(literal: UnicodeCharacterLiteral, questionToken: Token[QuestionToken]): Terminal = js.native
}
