package typings.grammarkdown.nodesMod

import typings.grammarkdown.tokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SyntaxKind */] () extends Node[TKind]

