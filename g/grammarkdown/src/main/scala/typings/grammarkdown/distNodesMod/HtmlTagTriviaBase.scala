package typings.grammarkdown.distNodesMod

import typings.grammarkdown.distTokensMod.HtmlTagTriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("grammarkdown/dist/nodes", "HtmlTagTriviaBase")
@js.native
open class HtmlTagTriviaBase[TKind /* <: HtmlTagTriviaKind */] protected () extends HtmlTriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
  
  val tagName: String = js.native
}
