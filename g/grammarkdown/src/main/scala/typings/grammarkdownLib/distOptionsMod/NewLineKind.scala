package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NewLineKind extends js.Object

@JSImport("grammarkdown/dist/options", "NewLineKind")
@js.native
object NewLineKind extends js.Object {
  @js.native
  sealed trait CarriageReturnLineFeed
    extends grammarkdownLib.distOptionsMod.NewLineKind
  
  @js.native
  sealed trait LineFeed
    extends grammarkdownLib.distOptionsMod.NewLineKind
  
  /* 1 */ val CarriageReturnLineFeed: CarriageReturnLineFeed with scala.Double = js.native
  /* 0 */ val LineFeed: LineFeed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grammarkdownLib.distOptionsMod.NewLineKind with scala.Double] = js.native
}

