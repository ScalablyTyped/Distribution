package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupManagersSetTemplateRequest extends StObject {
  
  /** URL of the InstanceTemplate resource from which all new instances will be created. */
  var instanceTemplate: js.UndefOr[String] = js.native
}
object RegionInstanceGroupManagersSetTemplateRequest {
  
  @scala.inline
  def apply(): RegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersSetTemplateRequest]
  }
  
  @scala.inline
  implicit class RegionInstanceGroupManagersSetTemplateRequestMutableBuilder[Self <: RegionInstanceGroupManagersSetTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
  }
}
