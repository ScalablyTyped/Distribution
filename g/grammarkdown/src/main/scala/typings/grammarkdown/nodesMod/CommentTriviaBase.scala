package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.CommentTriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/nodes", "CommentTriviaBase")
@js.native
abstract class CommentTriviaBase[TKind /* <: CommentTriviaKind */] protected () extends TriviaBase[TKind] {
  def this(kind: TKind) = this()
}
