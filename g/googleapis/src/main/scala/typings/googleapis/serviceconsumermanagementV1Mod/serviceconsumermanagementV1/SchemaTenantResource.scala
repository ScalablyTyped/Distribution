package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource constituting the TenancyUnit.
  */
@js.native
trait SchemaTenantResource extends StObject {
  
  /**
    * @OutputOnly Identifier of the tenant resource. For cloud projects, it is
    * in the form &#39;projects/{number}&#39;. For example
    * &#39;projects/123456&#39;.
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    * Status of tenant resource.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Unique per single tenancy unit.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaTenantResource {
  
  @scala.inline
  def apply(): SchemaTenantResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantResource]
  }
  
  @scala.inline
  implicit class SchemaTenantResourceMutableBuilder[Self <: SchemaTenantResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
