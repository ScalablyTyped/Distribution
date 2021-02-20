package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRegionInstanceGroupManagersSetTemplateRequest extends StObject {
  
  /**
    * URL of the InstanceTemplate resource from which all new instances will be
    * created.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
}
object SchemaRegionInstanceGroupManagersSetTemplateRequest {
  
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersSetTemplateRequestMutableBuilder[Self <: SchemaRegionInstanceGroupManagersSetTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
  }
}
