package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Node")
@js.native
abstract class Node[TKind /* <: grammarkdownLib.distTokensMod.SyntaxKind */] protected ()
  extends grammarkdownLib.distNodesMod.Node[TKind] {
  def this(kind: TKind) = this()
}

