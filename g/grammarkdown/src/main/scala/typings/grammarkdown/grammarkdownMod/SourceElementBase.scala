package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SourceElementBase")
@js.native
abstract class SourceElementBase[TKind /* <: SyntaxKind */] ()
  extends typings.grammarkdown.distNodesMod.Node[TKind]

