package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about an accelerator that can be attached to a VM.
  */
@js.native
trait SchemaAccelerator extends js.Object {
  /**
    * How many accelerators of this type to attach.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The accelerator type string (for example, &quot;nvidia-tesla-k80&quot;).
    * Only NVIDIA GPU accelerators are currently supported. If an NVIDIA GPU is
    * attached, the required runtime libraries will be made available to all
    * containers under `/usr/local/nvidia`. The driver version to install must
    * be specified using the NVIDIA driver version parameter on the virtual
    * machine specification. Note that attaching a GPU increases the worker VM
    * startup time by a few minutes.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAccelerator {
  @scala.inline
  def apply(): SchemaAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccelerator]
  }
  @scala.inline
  implicit class SchemaAcceleratorOps[Self <: SchemaAccelerator] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

