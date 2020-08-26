package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsAddHealthCheckRequest extends js.Object {
  /**
    * The HttpHealthCheck to add to the target pool.
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheckReference]] = js.native
}

object SchemaTargetPoolsAddHealthCheckRequest {
  @scala.inline
  def apply(): SchemaTargetPoolsAddHealthCheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetPoolsAddHealthCheckRequest]
  }
  @scala.inline
  implicit class SchemaTargetPoolsAddHealthCheckRequestOps[Self <: SchemaTargetPoolsAddHealthCheckRequest] (val x: Self) extends AnyVal {
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
    def setHealthChecksVarargs(value: SchemaHealthCheckReference*): Self = this.set("healthChecks", js.Array(value :_*))
    @scala.inline
    def setHealthChecks(value: js.Array[SchemaHealthCheckReference]): Self = this.set("healthChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthChecks: Self = this.set("healthChecks", js.undefined)
  }
  
}

