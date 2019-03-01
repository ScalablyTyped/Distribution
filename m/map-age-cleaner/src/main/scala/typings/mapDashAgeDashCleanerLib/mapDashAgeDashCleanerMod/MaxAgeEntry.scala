package typings
package mapDashAgeDashCleanerLib.mapDashAgeDashCleanerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeEntry extends Entry {
  var maxAge: scala.Double
}

object MaxAgeEntry {
  @scala.inline
  def apply(maxAge: scala.Double): MaxAgeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxAge")(maxAge)
    __obj.asInstanceOf[MaxAgeEntry]
  }
}

