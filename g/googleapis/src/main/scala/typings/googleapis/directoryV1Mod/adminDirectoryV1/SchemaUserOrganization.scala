package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an organization entry.
  */
trait SchemaUserOrganization extends StObject {
  
  /**
    * The cost center of the users department.
    */
  var costCenter: js.UndefOr[String] = js.undefined
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.undefined
  
  /**
    * Department within the organization.
    */
  var department: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the organization.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The domain to which the organization belongs to.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The full-time equivalent percent within the organization (100000 = 100%).
    */
  var fullTimeEquivalent: js.UndefOr[Double] = js.undefined
  
  /**
    * Location of the organization. This need not be fully qualified address.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the organization
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If it user&#39;s primary organization.
    */
  var primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Symbol of the organization.
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * Title (designation) of the user in the organization.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example organization could be of school, work etc. In addition to the
    * standard type, an entry can have a custom type and can give it any name.
    * Such types should have the CUSTOM value as type and also have a
    * CustomType value.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaUserOrganization {
  
  inline def apply(): SchemaUserOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserOrganization]
  }
  
  extension [Self <: SchemaUserOrganization](x: Self) {
    
    inline def setCostCenter(value: String): Self = StObject.set(x, "costCenter", value.asInstanceOf[js.Any])
    
    inline def setCostCenterUndefined: Self = StObject.set(x, "costCenter", js.undefined)
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setFullTimeEquivalent(value: Double): Self = StObject.set(x, "fullTimeEquivalent", value.asInstanceOf[js.Any])
    
    inline def setFullTimeEquivalentUndefined: Self = StObject.set(x, "fullTimeEquivalent", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
