package typings.kss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kssMod {
  import typings.std.Error

  type CallbackFn = js.Function2[/* error */ Error | Null, /* styleguide */ KssStyleguide, Unit]
}
