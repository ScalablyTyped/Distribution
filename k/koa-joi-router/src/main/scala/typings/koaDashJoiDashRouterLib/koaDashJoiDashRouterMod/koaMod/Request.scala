package typings
package koaDashJoiDashRouterLib.koaDashJoiDashRouterMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Request {
  @scala.inline
  def apply(params: org.scalablytyped.runtime.StringDictionary[java.lang.String], body: js.Any = null): Request = {
    val __obj = js.Dynamic.literal(params = params)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Request]
  }
}

