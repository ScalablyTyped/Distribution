package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distNodesMod.OptionalSymbolKind
import typings.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected ()
  extends typings.grammarkdown.distNodesMod.OptionalSymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: typings.grammarkdown.distNodesMod.Token[QuestionToken]) = this()
}

