package typings
package grammarkdownLib.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: grammarkdownLib.distNodesMod.OptionalSymbolKind */] protected ()
  extends grammarkdownLib.distNodesMod.OptionalSymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: grammarkdownLib.distNodesMod.Token[grammarkdownLib.distTokensMod.SyntaxKind]) = this()
}

