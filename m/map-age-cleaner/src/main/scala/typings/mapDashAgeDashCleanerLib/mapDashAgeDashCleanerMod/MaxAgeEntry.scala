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
  def apply(maxAge: scala.Double, StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null): MaxAgeEntry = {
    val __obj = js.Dynamic.literal(maxAge = maxAge)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MaxAgeEntry]
  }
}

