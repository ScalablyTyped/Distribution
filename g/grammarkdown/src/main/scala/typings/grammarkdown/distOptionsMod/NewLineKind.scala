package typings.grammarkdown.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NewLineKind extends js.Object

@JSImport("grammarkdown/dist/options", "NewLineKind")
@js.native
object NewLineKind extends js.Object {
  @js.native
  sealed trait CarriageReturnLineFeed extends NewLineKind
  
  @js.native
  sealed trait LineFeed extends NewLineKind
  
  /* 1 */ val CarriageReturnLineFeed: typings.grammarkdown.distOptionsMod.NewLineKind.CarriageReturnLineFeed with Double = js.native
  /* 0 */ val LineFeed: typings.grammarkdown.distOptionsMod.NewLineKind.LineFeed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind with Double] = js.native
}

