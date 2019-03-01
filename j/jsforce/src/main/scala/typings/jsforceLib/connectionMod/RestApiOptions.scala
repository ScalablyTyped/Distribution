package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestApiOptions extends js.Object {
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object RestApiOptions {
  @scala.inline
  def apply(headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): RestApiOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RestApiOptions]
  }
}

