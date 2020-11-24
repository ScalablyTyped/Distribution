package typings.grammarkdown.optionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends js.Object
@JSImport("grammarkdown/dist/options", "NewLineKind")
@js.native
object NewLineKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
  
  /**
    * Lines should be terminted with a carriage-return followed by a line-feed (DOS-style).
    */
  @js.native
  sealed trait CarriageReturnLineFeed extends NewLineKind
  /* 1 */ @js.native
  object CarriageReturnLineFeed extends TopLevel[CarriageReturnLineFeed with Double]
  
  /**
    * Lines should be terminated with a line-feed (Unix-style).
    */
  @js.native
  sealed trait LineFeed extends NewLineKind
  /* 0 */ @js.native
  object LineFeed extends TopLevel[LineFeed with Double]
}
