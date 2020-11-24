package typings.grammarkdown.mod

import typings.grammarkdown.tokensMod.TriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "TriviaBase")
@js.native
abstract class TriviaBase[TKind /* <: TriviaKind */] ()
  extends typings.grammarkdown.nodesMod.Node[TKind]
