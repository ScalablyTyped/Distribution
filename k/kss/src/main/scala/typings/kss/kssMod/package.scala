package typings.kss

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kssMod {
  type CallbackFn = js.Function2[/* error */ Error | Null, /* styleguide */ KssStyleguide, Unit]
}
