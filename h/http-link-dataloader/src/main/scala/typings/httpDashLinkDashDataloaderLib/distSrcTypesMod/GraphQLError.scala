package typings
package httpDashLinkDashDataloaderLib.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLError extends js.Object {
  var locations: js.UndefOr[js.Array[httpDashLinkDashDataloaderLib.Anon_Column]] = js.undefined
  var message: java.lang.String
  var path: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GraphQLError {
  @scala.inline
  def apply(
    message: java.lang.String,
    locations: js.Array[httpDashLinkDashDataloaderLib.Anon_Column] = null,
    path: js.Array[java.lang.String] = null
  ): GraphQLError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GraphQLError]
  }
}

