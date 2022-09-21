package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about an accelerator that can be attached to a VM.
  */
trait SchemaAccelerator extends StObject {
  
  /**
    * How many accelerators of this type to attach.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The accelerator type string (for example, "nvidia-tesla-k80"). Only NVIDIA GPU accelerators are currently supported. If an NVIDIA GPU is attached, the required runtime libraries will be made available to all containers under `/usr/local/nvidia`. The driver version to install must be specified using the NVIDIA driver version parameter on the virtual machine specification. Note that attaching a GPU increases the worker VM startup time by a few minutes.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccelerator {
  
  inline def apply(): SchemaAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccelerator]
  }
  
  extension [Self <: SchemaAccelerator](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
