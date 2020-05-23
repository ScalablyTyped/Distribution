package typings.graphqlRequest.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponse
  extends /* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[js.Any] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var status: Double
}

object GraphQLResponse {
  @scala.inline
  def apply(
    status: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    data: js.Any = null,
    errors: js.Array[GraphQLError] = null,
    extensions: js.Any = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponse]
  }
}

