package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: grammarkdownLib.distTokensMod.HtmlTriviaKind */] protected ()
  extends grammarkdownLib.distNodesMod.HtmlTriviaBase[TKind] {
  def this(kind: TKind, tagName: java.lang.String) = this()
}

