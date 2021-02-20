package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.grammarkdownMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected () extends PrimarySymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: Token[QuestionToken]) = this()
  
  val questionToken: js.UndefOr[Token[QuestionToken]] = js.native
}
