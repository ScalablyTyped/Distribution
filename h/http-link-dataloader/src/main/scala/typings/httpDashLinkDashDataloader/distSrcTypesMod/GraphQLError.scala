package typings.httpDashLinkDashDataloader.distSrcTypesMod

import typings.httpDashLinkDashDataloader.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLError extends js.Object {
  var locations: js.UndefOr[js.Array[Anon_Column]] = js.undefined
  var message: String
  var path: js.UndefOr[js.Array[String]] = js.undefined
}

object GraphQLError {
  @scala.inline
  def apply(message: String, locations: js.Array[Anon_Column] = null, path: js.Array[String] = null): GraphQLError = {
    val __obj = js.Dynamic.literal(message = message)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GraphQLError]
  }
}

