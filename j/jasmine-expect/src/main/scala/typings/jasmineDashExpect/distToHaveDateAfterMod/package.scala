package typings.jasmineDashExpect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distToHaveDateAfterMod {
  type ToHaveDateAfter = js.Function3[
    /* key */ String, 
    /* otherDate */ Date, 
    /* expectationFailOutput */ js.UndefOr[js.Any], 
    Boolean
  ]
}
