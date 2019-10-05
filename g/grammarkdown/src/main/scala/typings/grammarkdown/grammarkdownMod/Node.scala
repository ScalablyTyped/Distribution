package typings.grammarkdown.grammarkdownMod

import typings.grammarkdown.distTokensMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: SyntaxKind */] protected ()
  extends typings.grammarkdown.distNodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

