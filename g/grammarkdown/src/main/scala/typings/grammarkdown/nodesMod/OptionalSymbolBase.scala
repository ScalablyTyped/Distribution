package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected () extends Node[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: Token[QuestionToken]) = this()
  val questionToken: js.UndefOr[Token[QuestionToken]] = js.native
}

