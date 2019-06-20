package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "MetaElementBase")
@js.native
abstract class MetaElementBase[TKind /* <: MetaElementKind */] protected () extends SourceElementBase[TKind] {
  def this(kind: TKind, atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.AtToken]) = this()
  val atToken: Token[grammarkdownLib.distTokensMod.SyntaxKind.AtToken] = js.native
}

