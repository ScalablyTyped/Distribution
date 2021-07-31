package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends StObject
@JSImport("grammarkdown/dist/grammarkdown", "NewLineKind")
@js.native
object NewLineKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind & Double] = js.native
  
  @js.native
  sealed trait CarriageReturnLineFeed
    extends StObject
       with NewLineKind
  /* 1 */ val CarriageReturnLineFeed: typings.grammarkdown.grammarkdownMod.NewLineKind.CarriageReturnLineFeed & Double = js.native
  
  @js.native
  sealed trait LineFeed
    extends StObject
       with NewLineKind
  /* 0 */ val LineFeed: typings.grammarkdown.grammarkdownMod.NewLineKind.LineFeed & Double = js.native
}
