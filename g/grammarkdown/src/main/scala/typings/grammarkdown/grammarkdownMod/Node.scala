package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: typings.grammarkdown.distTokensMod.SyntaxKind */] protected ()
  extends typings.grammarkdown.distNodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

