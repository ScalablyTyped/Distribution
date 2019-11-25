package typings.atJupyterlabCoreutils.libPollMod.Poll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates when the poll switches to standby.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.never
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`when-hidden`
*/
trait Standby extends js.Object

object Standby {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.never = this.cast("never")
  @scala.inline
  def `when-hidden`: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.`when-hidden` = this.cast("when-hidden")
}

