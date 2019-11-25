package typings.jsforce.connectionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestApiOptions extends js.Object {
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
}

object RestApiOptions {
  @scala.inline
  def apply(headers: StringDictionary[String] = null): RestApiOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiOptions]
  }
}

