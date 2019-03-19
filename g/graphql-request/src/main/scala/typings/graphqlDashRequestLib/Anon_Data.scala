package typings
package graphqlDashRequestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T /* <: js.Any */] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlDashRequestLib.distSrcTypesMod.GraphQLError]] = js.undefined
  var extensions: js.UndefOr[js.Any] = js.undefined
  var headers: stdLib.Headers
  var status: scala.Double
}

object Anon_Data {
  @scala.inline
  def apply[T /* <: js.Any */](
    headers: stdLib.Headers,
    status: scala.Double,
    data: T = null,
    errors: js.Array[graphqlDashRequestLib.distSrcTypesMod.GraphQLError] = null,
    extensions: js.Any = null
  ): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(headers = headers, status = status)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Anon_Data[T]]
  }
}

