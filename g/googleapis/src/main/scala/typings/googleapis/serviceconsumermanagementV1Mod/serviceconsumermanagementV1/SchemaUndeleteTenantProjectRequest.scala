package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message to undelete tenant project resource previously deleted from
  * the tenancy unit.
  */
trait SchemaUndeleteTenantProjectRequest extends StObject {
  
  /**
    * Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaUndeleteTenantProjectRequest {
  
  @scala.inline
  def apply(): SchemaUndeleteTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteTenantProjectRequest]
  }
  
  @scala.inline
  implicit class SchemaUndeleteTenantProjectRequestMutableBuilder[Self <: SchemaUndeleteTenantProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
