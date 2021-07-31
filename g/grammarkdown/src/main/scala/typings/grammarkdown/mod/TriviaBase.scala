package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.TriviaKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "TriviaBase")
@js.native
abstract class TriviaBase[TKind /* <: TriviaKind */] protected ()
  extends typings.grammarkdown.nodesMod.TriviaBase[TKind] {
  def this(kind: TKind) = this()
}
