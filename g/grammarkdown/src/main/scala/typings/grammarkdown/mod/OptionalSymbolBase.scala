package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.OptionalSymbolKind
import typings.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected ()
  extends typings.grammarkdown.nodesMod.OptionalSymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: typings.grammarkdown.nodesMod.Token[QuestionToken]) = this()
}

