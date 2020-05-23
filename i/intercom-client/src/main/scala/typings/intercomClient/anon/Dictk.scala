package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictk extends /* k */ StringDictionary[String] {
  var status: String
}

object Dictk {
  @scala.inline
  def apply(status: String, StringDictionary: /* name */ StringDictionary[String] = null): Dictk = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictk]
  }
}

