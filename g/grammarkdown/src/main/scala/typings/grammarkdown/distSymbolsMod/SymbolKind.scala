package typings.grammarkdown.distSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolKind extends js.Object

@JSImport("grammarkdown/dist/symbols", "SymbolKind")
@js.native
object SymbolKind extends js.Object {
  @js.native
  sealed trait Parameter extends SymbolKind
  
  @js.native
  sealed trait Production extends SymbolKind
  
  @js.native
  sealed trait SourceFile extends SymbolKind
  
  /* 2 */ val Parameter: typings.grammarkdown.distSymbolsMod.SymbolKind.Parameter with Double = js.native
  /* 1 */ val Production: typings.grammarkdown.distSymbolsMod.SymbolKind.Production with Double = js.native
  /* 0 */ val SourceFile: typings.grammarkdown.distSymbolsMod.SymbolKind.SourceFile with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolKind with Double] = js.native
}

