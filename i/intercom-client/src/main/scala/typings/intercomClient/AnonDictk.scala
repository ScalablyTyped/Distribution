package typings.intercomClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictk extends /* k */ StringDictionary[String] {
  var status: String
}

object AnonDictk {
  @scala.inline
  def apply(status: String, StringDictionary: /* k */ StringDictionary[String] = null): AnonDictk = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictk]
  }
}

