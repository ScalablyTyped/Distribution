package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance failover request.
  */
@js.native
trait SchemaInstancesFailoverRequest extends js.Object {
  /**
    * Failover Context.
    */
  var failoverContext: js.UndefOr[SchemaFailoverContext] = js.native
}

object SchemaInstancesFailoverRequest {
  @scala.inline
  def apply(failoverContext: SchemaFailoverContext = null): SchemaInstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    if (failoverContext != null) __obj.updateDynamic("failoverContext")(failoverContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesFailoverRequest]
  }
}

