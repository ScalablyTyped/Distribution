package typings
package httpDashLinkDashDataloaderLib.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponse
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var data: js.UndefOr[js.Any] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var status: scala.Double
}

object GraphQLResponse {
  @scala.inline
  def apply(
    status: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    data: js.Any = null,
    errors: js.Array[GraphQLError] = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[GraphQLResponse]
  }
}

