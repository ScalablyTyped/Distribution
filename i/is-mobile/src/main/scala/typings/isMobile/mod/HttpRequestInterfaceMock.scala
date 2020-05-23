package typings.isMobile.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestInterfaceMock
  extends /* id */ StringDictionary[js.Any] {
  var headers: HttpRequestHeadersInterfaceMock
}

object HttpRequestInterfaceMock {
  @scala.inline
  def apply(
    headers: HttpRequestHeadersInterfaceMock,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): HttpRequestInterfaceMock = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HttpRequestInterfaceMock]
  }
}

