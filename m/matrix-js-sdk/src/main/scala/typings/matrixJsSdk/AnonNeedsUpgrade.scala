package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNeedsUpgrade extends js.Object {
  var needsUpgrade: Boolean
  var urgent: Boolean
  var version: String
}

object AnonNeedsUpgrade {
  @scala.inline
  def apply(needsUpgrade: Boolean, urgent: Boolean, version: String): AnonNeedsUpgrade = {
    val __obj = js.Dynamic.literal(needsUpgrade = needsUpgrade.asInstanceOf[js.Any], urgent = urgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNeedsUpgrade]
  }
}

