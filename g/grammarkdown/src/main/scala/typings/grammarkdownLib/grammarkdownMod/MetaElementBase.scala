package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: grammarkdownLib.distNodesMod.MetaElementKind */] protected ()
  extends grammarkdownLib.distNodesMod.MetaElementBase[TKind] {
  def this(kind: TKind, atToken: grammarkdownLib.distNodesMod.Token[grammarkdownLib.distTokensMod.SyntaxKind.AtToken]) = this()
}

