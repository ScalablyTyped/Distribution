package typings.mapAgeCleaner.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAgeEntry extends Entry {
  var maxAge: Double
}

object MaxAgeEntry {
  @scala.inline
  def apply(maxAge: Double, StringDictionary: StringDictionary[js.Any] = null): MaxAgeEntry = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MaxAgeEntry]
  }
}

