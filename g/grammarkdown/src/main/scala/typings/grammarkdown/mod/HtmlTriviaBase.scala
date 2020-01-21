package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.HtmlTriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: HtmlTriviaKind */] protected ()
  extends typings.grammarkdown.nodesMod.HtmlTriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
}

