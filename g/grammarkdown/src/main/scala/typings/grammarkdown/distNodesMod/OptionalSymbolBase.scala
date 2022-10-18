package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.OptionalSymbolKind
import typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "OptionalSymbolBase")
@js.native
open class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected () extends PrimarySymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: Token[QuestionToken]) = this()
  
  val questionToken: js.UndefOr[Token[QuestionToken]] = js.native
}
