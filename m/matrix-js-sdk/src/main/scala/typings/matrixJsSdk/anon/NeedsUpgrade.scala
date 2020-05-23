package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeedsUpgrade extends js.Object {
  var needsUpgrade: Boolean
  var urgent: Boolean
  var version: String
}

object NeedsUpgrade {
  @scala.inline
  def apply(needsUpgrade: Boolean, urgent: Boolean, version: String): NeedsUpgrade = {
    val __obj = js.Dynamic.literal(needsUpgrade = needsUpgrade.asInstanceOf[js.Any], urgent = urgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsUpgrade]
  }
}

