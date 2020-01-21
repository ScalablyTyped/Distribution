package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates which [regional endpoint]
  * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) failed
  * to respond to a request for data.
  */
@js.native
trait SchemaFailedLocation extends js.Object {
  /**
    * The name of the [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFailedLocation {
  @scala.inline
  def apply(name: String = null): SchemaFailedLocation = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFailedLocation]
  }
}

