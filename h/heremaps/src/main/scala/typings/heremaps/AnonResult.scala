package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  var Result: js.Array[AnonLocation]
}

object AnonResult {
  @scala.inline
  def apply(Result: js.Array[AnonLocation]): AnonResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResult]
  }
}

