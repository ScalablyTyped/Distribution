package typings.jasmineDashExpect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distToHaveDateBeforeMod {
  type ToHaveDateBefore = js.Function3[
    /* key */ String, 
    /* otherDate */ Date, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
}
