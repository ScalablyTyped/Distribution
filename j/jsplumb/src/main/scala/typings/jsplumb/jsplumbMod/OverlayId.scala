package typings.jsplumb.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsplumb.jsplumbStrings.Label
  - typings.jsplumb.jsplumbStrings.Arrow
  - typings.jsplumb.jsplumbStrings.PlainArrow
  - typings.jsplumb.jsplumbStrings.Custom
*/
trait OverlayId extends js.Object

object OverlayId {
  @scala.inline
  def Arrow: typings.jsplumb.jsplumbStrings.Arrow = this.cast("Arrow")
  @scala.inline
  def Custom: typings.jsplumb.jsplumbStrings.Custom = this.cast("Custom")
  @scala.inline
  def Label: typings.jsplumb.jsplumbStrings.Label = this.cast("Label")
  @scala.inline
  def PlainArrow: typings.jsplumb.jsplumbStrings.PlainArrow = this.cast("PlainArrow")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

