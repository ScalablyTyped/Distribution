package typings.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A domain serving an App Engine application.
  */
@js.native
trait SchemaDomainMapping extends js.Object {
  
  /**
    * Relative name of the domain serving the application. Example:
    * example.com.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Full path to the DomainMapping resource in the API. Example:
    * apps/myapp/domainMapping/example.com.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The resource records required to configure this domain mapping. These
    * records must be added to the domain&#39;s DNS configuration in order to
    * serve the application via this domain mapping.@OutputOnly
    */
  var resourceRecords: js.UndefOr[js.Array[SchemaResourceRecord]] = js.native
  
  /**
    * SSL configuration for this domain. If unconfigured, this domain will not
    * serve with SSL.
    */
  var sslSettings: js.UndefOr[SchemaSslSettings] = js.native
}
object SchemaDomainMapping {
  
  @scala.inline
  def apply(): SchemaDomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMapping]
  }
  
  @scala.inline
  implicit class SchemaDomainMappingOps[Self <: SchemaDomainMapping] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceRecordsVarargs(value: SchemaResourceRecord*): Self = this.set("resourceRecords", js.Array(value :_*))
    
    @scala.inline
    def setResourceRecords(value: js.Array[SchemaResourceRecord]): Self = this.set("resourceRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceRecords: Self = this.set("resourceRecords", js.undefined)
    
    @scala.inline
    def setSslSettings(value: SchemaSslSettings): Self = this.set("sslSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslSettings: Self = this.set("sslSettings", js.undefined)
  }
}
