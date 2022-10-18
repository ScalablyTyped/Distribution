package typings.grammarkdown.mod

import typings.grammarkdown.distTokensMod.HtmlTagTriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown", "HtmlTagTriviaBase")
@js.native
open class HtmlTagTriviaBase[TKind /* <: HtmlTagTriviaKind */] protected ()
  extends typings.grammarkdown.distNodesMod.HtmlTagTriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
}
