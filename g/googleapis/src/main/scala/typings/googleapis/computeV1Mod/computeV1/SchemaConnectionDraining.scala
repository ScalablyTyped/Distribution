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
  def apply(): SchemaConnectionDraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionDraining]
  }
  @scala.inline
  implicit class SchemaConnectionDrainingOps[Self <: SchemaConnectionDraining] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrainingTimeoutSec(value: Double): Self = this.set("drainingTimeoutSec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrainingTimeoutSec: Self = this.set("drainingTimeoutSec", js.undefined)
  }
  
}

