package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated after a worker VM has been assigned to run the pipeline.
  */
@js.native
trait SchemaWorkerAssignedEvent extends js.Object {
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The zone the worker is running in.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaWorkerAssignedEvent {
  @scala.inline
  def apply(instance: String = null, zone: String = null): SchemaWorkerAssignedEvent = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkerAssignedEvent]
  }
}

