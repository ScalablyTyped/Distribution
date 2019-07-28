package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.HtmlTriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: HtmlTriviaKind */] protected ()
  extends typings.grammarkdown.distNodesMod.HtmlTriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
}

