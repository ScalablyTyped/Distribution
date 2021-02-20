package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolKind extends StObject
@JSImport("grammarkdown/dist/grammarkdown", "SymbolKind")
@js.native
object SymbolKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolKind with Double] = js.native
  
  @js.native
  sealed trait Parameter extends SymbolKind
  /* 2 */ val Parameter: typings.grammarkdown.grammarkdownMod.SymbolKind.Parameter with Double = js.native
  
  @js.native
  sealed trait Production extends SymbolKind
  /* 1 */ val Production: typings.grammarkdown.grammarkdownMod.SymbolKind.Production with Double = js.native
  
  @js.native
  sealed trait SourceFile extends SymbolKind
  /* 0 */ val SourceFile: typings.grammarkdown.grammarkdownMod.SymbolKind.SourceFile with Double = js.native
}
