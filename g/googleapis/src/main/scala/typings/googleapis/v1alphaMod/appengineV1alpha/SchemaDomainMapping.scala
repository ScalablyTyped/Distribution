package typings.googleapis.v1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A domain serving an App Engine application.
  */
@js.native
trait SchemaDomainMapping extends StObject {
  
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
  implicit class SchemaDomainMappingMutableBuilder[Self <: SchemaDomainMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceRecords(value: js.Array[SchemaResourceRecord]): Self = StObject.set(x, "resourceRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordsUndefined: Self = StObject.set(x, "resourceRecords", js.undefined)
    
    @scala.inline
    def setResourceRecordsVarargs(value: SchemaResourceRecord*): Self = StObject.set(x, "resourceRecords", js.Array(value :_*))
    
    @scala.inline
    def setSslSettings(value: SchemaSslSettings): Self = StObject.set(x, "sslSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslSettingsUndefined: Self = StObject.set(x, "sslSettings", js.undefined)
  }
}
