package typings.jupyterlabCoreutils.interfacesMod

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
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.constructed
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.disposed
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.reconnected
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.refreshed
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.rejected
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.resolved
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.standby
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.started
    - typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.stopped
  */
  type Phase[T /* <: java.lang.String */] = typings.jupyterlabCoreutils.interfacesMod.IPoll._Phase[T] | T
}
