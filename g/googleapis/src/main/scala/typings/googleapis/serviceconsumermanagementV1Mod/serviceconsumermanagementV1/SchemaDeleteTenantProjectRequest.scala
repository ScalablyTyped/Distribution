package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message to delete tenant project resource from the tenancy unit.
  */
trait SchemaDeleteTenantProjectRequest extends StObject {
  
  /**
    * Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaDeleteTenantProjectRequest {
  
  @scala.inline
  def apply(): SchemaDeleteTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTenantProjectRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteTenantProjectRequestMutableBuilder[Self <: SchemaDeleteTenantProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
