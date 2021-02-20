package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an organization entry.
  */
@js.native
trait SchemaUserOrganization extends StObject {
  
  /**
    * The cost center of the users department.
    */
  var costCenter: js.UndefOr[String] = js.native
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  
  /**
    * Department within the organization.
    */
  var department: js.UndefOr[String] = js.native
  
  /**
    * Description of the organization.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The domain to which the organization belongs to.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The full-time equivalent percent within the organization (100000 = 100%).
    */
  var fullTimeEquivalent: js.UndefOr[Double] = js.native
  
  /**
    * Location of the organization. This need not be fully qualified address.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Name of the organization
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If it user&#39;s primary organization.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
  /**
    * Symbol of the organization.
    */
  var symbol: js.UndefOr[String] = js.native
  
  /**
    * Title (designation) of the user in the organization.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example organization could be of school, work etc. In addition to the
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have the CUSTOM value as type and also have a
    * CustomType value.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaUserOrganization {
  
  @scala.inline
  def apply(): SchemaUserOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserOrganization]
  }
  
  @scala.inline
  implicit class SchemaUserOrganizationMutableBuilder[Self <: SchemaUserOrganization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCostCenter(value: String): Self = StObject.set(x, "costCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostCenterUndefined: Self = StObject.set(x, "costCenter", js.undefined)
    
    @scala.inline
    def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setFullTimeEquivalent(value: Double): Self = StObject.set(x, "fullTimeEquivalent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTimeEquivalentUndefined: Self = StObject.set(x, "fullTimeEquivalent", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
