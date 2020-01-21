package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing connection draining configuration.
  */
@js.native
trait SchemaConnectionDraining extends js.Object {
  /**
    * Time for which instance will be drained (not accept new connections, but
    * still work to finish started).
    */
  var drainingTimeoutSec: js.UndefOr[Double] = js.native
}

object SchemaConnectionDraining {
  @scala.inline
  def apply(drainingTimeoutSec: Int | Double = null): SchemaConnectionDraining = {
    val __obj = js.Dynamic.literal()
    if (drainingTimeoutSec != null) __obj.updateDynamic("drainingTimeoutSec")(drainingTimeoutSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConnectionDraining]
  }
}

