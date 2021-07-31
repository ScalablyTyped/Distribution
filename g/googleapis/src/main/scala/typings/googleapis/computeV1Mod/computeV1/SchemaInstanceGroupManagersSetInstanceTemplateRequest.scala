package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceGroupManagersSetInstanceTemplateRequest extends StObject {
  
  /**
    * The URL of the instance template that is specified for this managed
    * instance group. The group uses this template to create all new instances
    * in the managed instance group.
    */
  var instanceTemplate: js.UndefOr[String] = js.undefined
}
object SchemaInstanceGroupManagersSetInstanceTemplateRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetInstanceTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetInstanceTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetInstanceTemplateRequestMutableBuilder[Self <: SchemaInstanceGroupManagersSetInstanceTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceTemplate(value: String): Self = StObject.set(x, "instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTemplateUndefined: Self = StObject.set(x, "instanceTemplate", js.undefined)
  }
}
