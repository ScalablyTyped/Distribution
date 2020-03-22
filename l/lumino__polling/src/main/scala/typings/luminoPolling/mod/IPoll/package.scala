package typings.luminoPolling.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPoll {
  /**
    * The phase of the poll when the current tick was scheduled.
    *
    * @typeparam T - A type for any additional tick phases a poll supports.
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.luminoPolling.luminoPollingStrings.constructed
    - typings.luminoPolling.luminoPollingStrings.disposed
    - typings.luminoPolling.luminoPollingStrings.reconnected
    - typings.luminoPolling.luminoPollingStrings.refreshed
    - typings.luminoPolling.luminoPollingStrings.rejected
    - typings.luminoPolling.luminoPollingStrings.resolved
    - typings.luminoPolling.luminoPollingStrings.standby
    - typings.luminoPolling.luminoPollingStrings.started
    - typings.luminoPolling.luminoPollingStrings.stopped
  */
  type Phase[T /* <: java.lang.String */] = typings.luminoPolling.mod.IPoll._Phase[T] | T
}
