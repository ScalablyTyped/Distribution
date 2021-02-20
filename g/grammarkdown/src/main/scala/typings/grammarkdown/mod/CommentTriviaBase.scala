package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.CommentTriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "CommentTriviaBase")
@js.native
abstract class CommentTriviaBase[TKind /* <: CommentTriviaKind */] protected ()
  extends typings.grammarkdown.nodesMod.CommentTriviaBase[TKind] {
  def this(kind: TKind) = this()
}
