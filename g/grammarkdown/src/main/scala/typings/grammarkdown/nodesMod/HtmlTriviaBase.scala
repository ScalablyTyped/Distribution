package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.HtmlTriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "HtmlTriviaBase")
@js.native
abstract class HtmlTriviaBase[TKind /* <: HtmlTriviaKind */] protected () extends TriviaBase[TKind] {
  def this(kind: TKind, tagName: String) = this()
  
  val tagName: String = js.native
}
