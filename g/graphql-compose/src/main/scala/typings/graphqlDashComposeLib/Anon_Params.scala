package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var payload: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply(
    params: java.lang.String | js.Array[java.lang.String] = null,
    payload: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Params]
  }
}

