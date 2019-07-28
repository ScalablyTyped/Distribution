package typings.atJupyterlabCoreutils.libInterfacesMod

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
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.constructed
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.disposed
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.reconnected
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.refreshed
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.rejected
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.resolved
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.standby
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.started
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stopped
  */
  type Phase[T /* <: String */] = _Phase[T] | T
}
