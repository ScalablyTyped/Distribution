package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteReply
  extends IExecuteCount
     with IReplyOkContent {
  /**
    * A list of payload objects.
    * Payloads are considered deprecated.
    * The only requirement of each payload object is that it have a 'source'
    * key, which is a string classifying the payload (e.g. 'page').
    */
  var payload: js.UndefOr[js.Array[JSONObject]] = js.undefined
  /**
    * Results for the user_expressions.
    */
  var user_expressions: JSONObject
}

object IExecuteReply {
  @scala.inline
  def apply(
    status: ok,
    user_expressions: JSONObject,
    execution_count: Int | Double = null,
    payload: js.Array[JSONObject] = null
  ): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_expressions = user_expressions.asInstanceOf[js.Any])
    if (execution_count != null) __obj.updateDynamic("execution_count")(execution_count.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReply]
  }
}

