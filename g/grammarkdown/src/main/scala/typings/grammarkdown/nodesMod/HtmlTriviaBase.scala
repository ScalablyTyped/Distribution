package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.HtmlTriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: HtmlTriviaKind */] protected () extends Node[TKind] {
  def this(kind: TKind, tagName: String) = this()
  val tagName: String = js.native
}

