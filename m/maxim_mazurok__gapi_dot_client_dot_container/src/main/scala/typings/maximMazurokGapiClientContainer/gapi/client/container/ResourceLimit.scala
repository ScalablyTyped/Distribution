package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLimit extends StObject {
  
  /** Maximum amount of the resource in the cluster. */
  var maximum: js.UndefOr[String] = js.native
  
  /** Minimum amount of the resource in the cluster. */
  var minimum: js.UndefOr[String] = js.native
  
  /** Resource name "cpu", "memory" or gpu-specific string. */
  var resourceType: js.UndefOr[String] = js.native
}
object ResourceLimit {
  
  @scala.inline
  def apply(): ResourceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLimit]
  }
  
  @scala.inline
  implicit class ResourceLimitMutableBuilder[Self <: ResourceLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
