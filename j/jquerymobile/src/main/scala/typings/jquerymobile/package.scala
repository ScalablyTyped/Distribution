package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jquerymobile {
  import typings.std.Event

  type JQueryMobileEvent = js.Function2[/* event */ Event, /* ui */ js.Any, Unit]
}
