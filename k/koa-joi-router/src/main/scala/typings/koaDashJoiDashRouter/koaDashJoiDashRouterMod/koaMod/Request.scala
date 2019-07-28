package typings.koaDashJoiDashRouter.koaDashJoiDashRouterMod.koaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var params: StringDictionary[String]
}

object Request {
  @scala.inline
  def apply(params: StringDictionary[String], body: js.Any = null): Request = {
    val __obj = js.Dynamic.literal(params = params)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Request]
  }
}

