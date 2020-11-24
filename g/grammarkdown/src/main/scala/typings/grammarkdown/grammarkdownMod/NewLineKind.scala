package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends js.Object
@JSImport("grammarkdown/dist/grammarkdown", "NewLineKind")
@js.native
object NewLineKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
  
  @js.native
  sealed trait CarriageReturnLineFeed extends NewLineKind
  /* 1 */ @js.native
  object CarriageReturnLineFeed extends TopLevel[CarriageReturnLineFeed with Double]
  
  @js.native
  sealed trait LineFeed extends NewLineKind
  /* 0 */ @js.native
  object LineFeed extends TopLevel[LineFeed with Double]
}
