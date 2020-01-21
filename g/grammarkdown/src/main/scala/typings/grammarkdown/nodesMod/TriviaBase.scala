package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.TriviaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "TriviaBase")
@js.native
abstract class TriviaBase[TKind /* <: TriviaKind */] () extends Node[TKind]

