package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about an accelerator that can be attached to a VM.
  */
@js.native
trait SchemaAccelerator extends StObject {
  
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
  implicit class SchemaAcceleratorMutableBuilder[Self <: SchemaAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
