package typings.ibmDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: js.Array[_]
  var sql: String
}

object AnonParams {
  @scala.inline
  def apply(params: js.Array[_], sql: String): AnonParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

