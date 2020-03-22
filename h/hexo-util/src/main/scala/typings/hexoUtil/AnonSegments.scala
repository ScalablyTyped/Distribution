package typings.hexoUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSegments extends js.Object {
  var segments: js.UndefOr[StringDictionary[String | RegExp]] = js.undefined
}

object AnonSegments {
  @scala.inline
  def apply(segments: StringDictionary[String | RegExp] = null): AnonSegments = {
    val __obj = js.Dynamic.literal()
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSegments]
  }
}

