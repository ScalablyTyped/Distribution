package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: grammarkdownLib.distTokensMod.HtmlTriviaKind */] protected () extends TriviaBase[TKind] {
  def this(kind: TKind, tagName: java.lang.String) = this()
  val tagName: java.lang.String = js.native
}

