package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message to remove a tenant project resource from the tenancy unit.
  */
@js.native
trait SchemaRemoveTenantProjectRequest extends StObject {
  
  /**
    * Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaRemoveTenantProjectRequest {
  
  @scala.inline
  def apply(): SchemaRemoveTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveTenantProjectRequest]
  }
  
  @scala.inline
  implicit class SchemaRemoveTenantProjectRequestMutableBuilder[Self <: SchemaRemoveTenantProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
