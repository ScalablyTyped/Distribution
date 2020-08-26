package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of the type and number of accelerator cards attached to the
  * instance.
  */
@js.native
trait SchemaAcceleratorConfig extends js.Object {
  /**
    * The number of the guest accelerator cards exposed to this instance.
    */
  var acceleratorCount: js.UndefOr[Double] = js.native
  /**
    * Full or partial URL of the accelerator type resource to attach to this
    * instance. For example:
    * projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100
    * If you are creating an instance template, specify only the accelerator
    * name. See GPUs on Compute Engine for a full list of accelerator types.
    */
  var acceleratorType: js.UndefOr[String] = js.native
}

object SchemaAcceleratorConfig {
  @scala.inline
  def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  @scala.inline
  implicit class SchemaAcceleratorConfigOps[Self <: SchemaAcceleratorConfig] (val x: Self) extends AnyVal {
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
    def setAcceleratorCount(value: Double): Self = this.set("acceleratorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorCount: Self = this.set("acceleratorCount", js.undefined)
    @scala.inline
    def setAcceleratorType(value: String): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
  }
  
}

