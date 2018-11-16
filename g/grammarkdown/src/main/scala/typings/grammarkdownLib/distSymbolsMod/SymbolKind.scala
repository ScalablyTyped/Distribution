package typings
package grammarkdownLib.distSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolKind extends js.Object

@JSImport("grammarkdown/dist/symbols", "SymbolKind")
@js.native
object SymbolKind extends js.Object {
  @js.native
  sealed trait Parameter
    extends grammarkdownLib.distSymbolsMod.SymbolKind
  
  @js.native
  sealed trait Production
    extends grammarkdownLib.distSymbolsMod.SymbolKind
  
  @js.native
  sealed trait SourceFile
    extends grammarkdownLib.distSymbolsMod.SymbolKind
  
  /* 2 */ val Parameter: Parameter with scala.Double = js.native
  /* 1 */ val Production: Production with scala.Double = js.native
  /* 0 */ val SourceFile: SourceFile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grammarkdownLib.distSymbolsMod.SymbolKind with scala.Double] = js.native
}

