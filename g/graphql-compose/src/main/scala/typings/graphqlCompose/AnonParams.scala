package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: js.UndefOr[String | js.Array[String]] = js.undefined
  var payload: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AnonParams {
  @scala.inline
  def apply(params: String | js.Array[String] = null, payload: String | js.Array[String] = null): AnonParams = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

