package typings
package atJupyterlabCoreutilsLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPollNs {
  /**
    * The phase of the poll when the current tick was scheduled.
    *
    * @typeparam T - A type for any additional tick phases a poll supports.
    */
  /* Rewritten from type alias, can be one of: 
    - T
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.constructed
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.disposed
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.reconnected
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.refreshed
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.rejected
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.resolved
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.standby
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.started
    - atJupyterlabCoreutilsLib.atJupyterlabCoreutilsLibStrings.stopped
  */
  type Phase[T /* <: java.lang.String */] = _Phase[T] | T
}
