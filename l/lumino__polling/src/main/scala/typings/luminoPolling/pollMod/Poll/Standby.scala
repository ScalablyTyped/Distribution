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
  def never: typings.luminoPolling.luminoPollingStrings.never = "never".asInstanceOf[typings.luminoPolling.luminoPollingStrings.never]
  @scala.inline
  def `when-hidden`: typings.luminoPolling.luminoPollingStrings.`when-hidden` = "when-hidden".asInstanceOf[typings.luminoPolling.luminoPollingStrings.`when-hidden`]
}

