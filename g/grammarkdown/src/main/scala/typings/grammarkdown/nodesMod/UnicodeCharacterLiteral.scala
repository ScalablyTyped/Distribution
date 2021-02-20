package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterLiteral")
@js.native
class UnicodeCharacterLiteral ()
  extends OptionalSymbolBase[typings.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterLiteral]
     with TextContent
     with OptionalSymbol {
  def this(text: String) = this()
  def this(text: js.UndefOr[scala.Nothing], questionToken: Token[QuestionToken]) = this()
  def this(text: String, questionToken: Token[QuestionToken]) = this()
}
