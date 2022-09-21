package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachTenantProjectRequest extends StObject {
  
  /**
    * When attaching an external project, this is in the format of `projects/{project_number\}`.
    */
  var externalResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When attaching a reserved project already in tenancy units, this is the tag of a tenant resource under the tenancy unit for the managed service's service producer project. The reserved tenant resource must be in an active state.
    */
  var reservedResource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Tag of the tenant resource after attachment. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttachTenantProjectRequest {
  
  inline def apply(): SchemaAttachTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachTenantProjectRequest]
  }
  
  extension [Self <: SchemaAttachTenantProjectRequest](x: Self) {
    
    inline def setExternalResource(value: String): Self = StObject.set(x, "externalResource", value.asInstanceOf[js.Any])
    
    inline def setExternalResourceNull: Self = StObject.set(x, "externalResource", null)
    
    inline def setExternalResourceUndefined: Self = StObject.set(x, "externalResource", js.undefined)
    
    inline def setReservedResource(value: String): Self = StObject.set(x, "reservedResource", value.asInstanceOf[js.Any])
    
    inline def setReservedResourceNull: Self = StObject.set(x, "reservedResource", null)
    
    inline def setReservedResourceUndefined: Self = StObject.set(x, "reservedResource", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
