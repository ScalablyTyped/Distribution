package typings.jpm.sdkPageDashModMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jpm.jpmStrings.existing
  - typings.jpm.jpmStrings.top
  - typings.jpm.jpmStrings.frame
*/
trait attachmentMode extends js.Object

object attachmentMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def existing: typings.jpm.jpmStrings.existing = this.cast("existing")
  @scala.inline
  def frame: typings.jpm.jpmStrings.frame = this.cast("frame")
  @scala.inline
  def top: typings.jpm.jpmStrings.top = this.cast("top")
}

