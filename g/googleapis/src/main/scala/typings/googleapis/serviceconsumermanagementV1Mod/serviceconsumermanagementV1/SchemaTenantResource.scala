package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource constituting the TenancyUnit.
  */
@js.native
trait SchemaTenantResource extends js.Object {
  
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
  implicit class SchemaTenantResourceOps[Self <: SchemaTenantResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
