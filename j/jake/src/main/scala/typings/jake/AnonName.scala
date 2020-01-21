package typings.jake

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName
  extends /* name */ StringDictionary[js.Any] {
  var quiet: Boolean
}

object AnonName {
  @scala.inline
  def apply(quiet: Boolean, StringDictionary: /* name */ StringDictionary[js.Any] = null): AnonName = {
    val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonName]
  }
}

