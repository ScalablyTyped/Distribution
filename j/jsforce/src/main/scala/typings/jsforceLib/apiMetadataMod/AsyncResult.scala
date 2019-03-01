package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncResult extends js.Object {
  var done: scala.Boolean
  var id: java.lang.String
  var message: js.UndefOr[java.lang.String] = js.undefined
  var state: java.lang.String
  var statusCode: js.UndefOr[java.lang.String] = js.undefined
}

object AsyncResult {
  @scala.inline
  def apply(
    done: scala.Boolean,
    id: java.lang.String,
    state: java.lang.String,
    message: java.lang.String = null,
    statusCode: java.lang.String = null
  ): AsyncResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("state")(state)
    if (message != null) __obj.updateDynamic("message")(message)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[AsyncResult]
  }
}

