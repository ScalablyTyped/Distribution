package typings.libraCore.mempoolPbMod.HealthCheckResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var isHealthy: Boolean
}

object AsObject {
  @scala.inline
  def apply(isHealthy: Boolean): AsObject = {
    val __obj = js.Dynamic.literal(isHealthy = isHealthy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

