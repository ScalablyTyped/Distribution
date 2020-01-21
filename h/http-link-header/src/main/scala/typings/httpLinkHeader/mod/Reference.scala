package typings.httpLinkHeader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends /* index */ StringDictionary[String] {
  var rel: String
  var uri: String
}

object Reference {
  @scala.inline
  def apply(rel: String, uri: String, StringDictionary: /* index */ StringDictionary[String] = null): Reference = {
    val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Reference]
  }
}

