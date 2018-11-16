package typings
package grammarkdownLib.distNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected () extends PrimarySymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
  val questionToken: js.UndefOr[Token[grammarkdownLib.distTokensMod.SyntaxKind]] = js.native
}

