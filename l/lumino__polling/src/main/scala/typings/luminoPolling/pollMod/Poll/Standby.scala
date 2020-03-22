package typings.luminoPolling.pollMod.Poll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates when the poll switches to standby.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoPolling.luminoPollingStrings.never
  - typings.luminoPolling.luminoPollingStrings.`when-hidden`
*/
trait Standby extends js.Object

object Standby {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def never: typings.luminoPolling.luminoPollingStrings.never = this.cast("never")
  @scala.inline
  def `when-hidden`: typings.luminoPolling.luminoPollingStrings.`when-hidden` = this.cast("when-hidden")
}

