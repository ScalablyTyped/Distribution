package typings.intercomClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonK extends /* k */ StringDictionary[String] {
  var status: String
}

object AnonK {
  @scala.inline
  def apply(status: String, StringDictionary: /* k */ StringDictionary[String] = null): AnonK = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonK]
  }
}

