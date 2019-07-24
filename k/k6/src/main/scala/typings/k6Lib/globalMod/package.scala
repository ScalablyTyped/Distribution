package typings
package k6Lib

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
