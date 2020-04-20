package typings.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match[P, D] extends js.Object {
  var params: P
  var paramsArray: js.Array[String]
  var route: D
}

object Match {
  @scala.inline
  def apply[P, D](params: P, paramsArray: js.Array[String], route: D): Match[P, D] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], paramsArray = paramsArray.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match[P, D]]
  }
}

