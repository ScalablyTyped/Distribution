package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the type and number of accelerator cards attached to the
  * instances of an instance. See GPUs on Compute Engine.
  */
@js.native
trait SchemaAcceleratorConfig extends js.Object {
  /**
    * The number of the accelerator cards of this type exposed to this
    * instance.
    */
  var acceleratorCount: js.UndefOr[Double] = js.native
  /**
    * Full URL, partial URI, or short name of the accelerator type resource to
    * expose to this instance. See Compute Engine AcceleratorTypes.Examples:
    * https://www.googleapis.com/compute/beta/projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80
    * projects/[project_id]/zones/us-east1-a/acceleratorTypes/nvidia-tesla-k80
    * nvidia-tesla-k80Auto Zone Exception: If you are using the Cloud Dataproc
    * Auto Zone Placement feature, you must use the short name of the
    * accelerator type resource, for example, nvidia-tesla-k80.
    */
  var acceleratorTypeUri: js.UndefOr[String] = js.native
}

object SchemaAcceleratorConfig {
  @scala.inline
  def apply(acceleratorCount: Int | Double = null, acceleratorTypeUri: String = null): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount.asInstanceOf[js.Any])
    if (acceleratorTypeUri != null) __obj.updateDynamic("acceleratorTypeUri")(acceleratorTypeUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
}

