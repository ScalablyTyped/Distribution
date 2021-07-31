package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1Capability extends StObject {
  
  /**
    * Available accelerators for the capability.
    */
  var availableAccelerators: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1Capability {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Capability]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1CapabilityMutableBuilder[Self <: SchemaGoogleCloudMlV1Capability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableAccelerators(value: js.Array[String]): Self = StObject.set(x, "availableAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableAcceleratorsUndefined: Self = StObject.set(x, "availableAccelerators", js.undefined)
    
    @scala.inline
    def setAvailableAcceleratorsVarargs(value: String*): Self = StObject.set(x, "availableAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
