package typings.graphqlRequest.anon

import typings.graphqlRequest.typesMod.GraphQLError
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T /* <: js.Any */] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var headers: Headers
  var status: Double
}

object Data {
  @scala.inline
  def apply[/* <: js.Any */ T](
    headers: Headers,
    status: Double,
    data: T = null,
    errors: js.Array[GraphQLError] = null,
    extensions: js.Any = null
  ): Data[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

