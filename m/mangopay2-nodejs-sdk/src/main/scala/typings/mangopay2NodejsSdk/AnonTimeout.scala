package typings.mangopay2NodejsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeout extends js.Object {
  var timeout: Double
}

object AnonTimeout {
  @scala.inline
  def apply(timeout: Double): AnonTimeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeout]
  }
}

