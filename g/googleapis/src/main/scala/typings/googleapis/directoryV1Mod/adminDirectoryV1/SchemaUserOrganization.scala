package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserOrganization extends StObject {
  
  /**
    * The cost center of the users department.
    */
  var costCenter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Department within the organization.
    */
  var department: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of the organization.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The domain to which the organization belongs to.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full-time equivalent millipercent within the organization (100000 = 100%).
    */
  var fullTimeEquivalent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Location of the organization. This need not be fully qualified address.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the organization
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If it user's primary organization.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Symbol of the organization.
    */
  var symbol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title (designation) of the user in the organization.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard types of that entry. For example organization could be of school work etc. In addition to the standard type an entry can have a custom type and can give it any name. Such types should have the CUSTOM value as type and also have a CustomType value.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserOrganization {
  
  inline def apply(): SchemaUserOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserOrganization]
  }
  
  extension [Self <: SchemaUserOrganization](x: Self) {
    
    inline def setCostCenter(value: String): Self = StObject.set(x, "costCenter", value.asInstanceOf[js.Any])
    
    inline def setCostCenterNull: Self = StObject.set(x, "costCenter", null)
    
    inline def setCostCenterUndefined: Self = StObject.set(x, "costCenter", js.undefined)
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeNull: Self = StObject.set(x, "customType", null)
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setDepartmentNull: Self = StObject.set(x, "department", null)
    
    inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setFullTimeEquivalent(value: Double): Self = StObject.set(x, "fullTimeEquivalent", value.asInstanceOf[js.Any])
    
    inline def setFullTimeEquivalentNull: Self = StObject.set(x, "fullTimeEquivalent", null)
    
    inline def setFullTimeEquivalentUndefined: Self = StObject.set(x, "fullTimeEquivalent", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
