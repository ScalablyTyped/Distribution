package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Terminal")
@js.native
class Terminal ()
  extends OptionalSymbolBase[typings.grammarkdown.grammarkdownMod.SyntaxKind.Terminal]
     with TextContent {
  def this(text: String) = this()
  def this(text: String, questionToken: Token[QuestionToken]) = this()
  def this(text: Unit, questionToken: Token[QuestionToken]) = this()
}
