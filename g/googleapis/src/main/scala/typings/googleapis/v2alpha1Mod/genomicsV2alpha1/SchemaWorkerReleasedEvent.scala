package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the worker VM that was assigned to the pipeline has
  * been released (deleted).
  */
@js.native
trait SchemaWorkerReleasedEvent extends js.Object {
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The zone the worker was running in.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaWorkerReleasedEvent {
  @scala.inline
  def apply(instance: String = null, zone: String = null): SchemaWorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkerReleasedEvent]
  }
}

