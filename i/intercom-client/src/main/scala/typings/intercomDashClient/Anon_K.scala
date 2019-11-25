package typings.intercomDashClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_K extends /* k */ StringDictionary[String] {
  var status: String
}

object Anon_K {
  @scala.inline
  def apply(status: String, StringDictionary: /* k */ StringDictionary[String] = null): Anon_K = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_K]
  }
}

