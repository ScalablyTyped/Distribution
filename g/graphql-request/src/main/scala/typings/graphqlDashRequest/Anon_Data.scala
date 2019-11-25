package typings.graphqlDashRequest

import typings.graphqlDashRequest.distSrcTypesMod.GraphQLError
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T /* <: js.Any */] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var headers: Headers
  var status: Double
}

object Anon_Data {
  @scala.inline
  def apply[T /* <: js.Any */](
    headers: Headers,
    status: Double,
    data: T = null,
    errors: js.Array[GraphQLError] = null,
    extensions: js.Any = null
  ): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data[T]]
  }
}

