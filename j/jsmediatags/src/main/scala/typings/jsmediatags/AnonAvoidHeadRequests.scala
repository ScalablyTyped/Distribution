package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAvoidHeadRequests extends js.Object {
  var avoidHeadRequests: Boolean
  var disallowedXhrHeaders: js.Array[String]
  var timeoutInSec: Double
}

object AnonAvoidHeadRequests {
  @scala.inline
  def apply(avoidHeadRequests: Boolean, disallowedXhrHeaders: js.Array[String], timeoutInSec: Double): AnonAvoidHeadRequests = {
    val __obj = js.Dynamic.literal(avoidHeadRequests = avoidHeadRequests.asInstanceOf[js.Any], disallowedXhrHeaders = disallowedXhrHeaders.asInstanceOf[js.Any], timeoutInSec = timeoutInSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvoidHeadRequests]
  }
}

