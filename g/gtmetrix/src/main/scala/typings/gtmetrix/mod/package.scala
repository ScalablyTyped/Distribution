package typings.gtmetrix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.std.Error
    - typings.gtmetrix.mod.InvalidResponseError
    - typings.gtmetrix.mod.ApiError
  */
  type MetricsError = typings.gtmetrix.mod._MetricsError | typings.std.Error
}
