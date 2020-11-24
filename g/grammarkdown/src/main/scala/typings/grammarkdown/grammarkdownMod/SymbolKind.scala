package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolKind extends js.Object
@JSImport("grammarkdown/dist/grammarkdown", "SymbolKind")
@js.native
object SymbolKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolKind with Double] = js.native
  
  @js.native
  sealed trait Parameter extends SymbolKind
  /* 2 */ @js.native
  object Parameter
    extends TopLevel[typings.grammarkdown.grammarkdownMod.SymbolKind.Parameter with Double]
  
  @js.native
  sealed trait Production extends SymbolKind
  /* 1 */ @js.native
  object Production
    extends TopLevel[typings.grammarkdown.grammarkdownMod.SymbolKind.Production with Double]
  
  @js.native
  sealed trait SourceFile extends SymbolKind
  /* 0 */ @js.native
  object SourceFile
    extends TopLevel[typings.grammarkdown.grammarkdownMod.SymbolKind.SourceFile with Double]
}
