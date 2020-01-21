package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalMod {
  /**
    * Log message procedure.
    * @public
    */
  type Logger = js.Function2[/* msg */ js.Any, /* repeated */ js.Any, scala.Unit]
}
