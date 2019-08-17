package typings.jasmineDashExpect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distToHaveDateBeforeMod {
  import typings.std.Date

  type ToHaveDateBefore = js.Function3[
    /* key */ String, 
    /* otherDate */ Date, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
}
