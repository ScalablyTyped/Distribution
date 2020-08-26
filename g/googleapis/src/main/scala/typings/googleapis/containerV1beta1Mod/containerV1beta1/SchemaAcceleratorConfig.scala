package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AcceleratorConfig represents a Hardware Accelerator request.
  */
@js.native
trait SchemaAcceleratorConfig extends js.Object {
  /**
    * The number of the accelerator cards exposed to an instance.
    */
  var acceleratorCount: js.UndefOr[String] = js.native
  /**
    * The accelerator type resource name. List of supported accelerators
    * [here](/compute/docs/gpus/#Introduction)
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
    def setAcceleratorCount(value: String): Self = this.set("acceleratorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorCount: Self = this.set("acceleratorCount", js.undefined)
    @scala.inline
    def setAcceleratorType(value: String): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
  }
  
}

