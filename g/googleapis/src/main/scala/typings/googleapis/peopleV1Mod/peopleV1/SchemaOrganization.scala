package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s past or current organization. Overlapping date ranges are
  * permitted.
  */
trait SchemaOrganization extends StObject {
  
  /**
    * True if the organization is the person&#39;s current organization; false
    * if the organization is a past organization.
    */
  var current: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The person&#39;s department at the organization.
    */
  var department: js.UndefOr[String] = js.undefined
  
  /**
    * The domain name associated with the organization; for example,
    * `google.com`.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The end date when the person left the organization.
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The read-only type of the organization translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /**
    * The person&#39;s job description at the organization.
    */
  var jobDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The location of the organization office the person works at.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the organization.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The name of the organization.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The phonetic name of the organization.
    */
  var phoneticName: js.UndefOr[String] = js.undefined
  
  /**
    * The start date when the person joined the organization.
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The symbol associated with the organization; for example, a stock ticker
    * symbol, abbreviation, or acronym.
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * The person&#39;s job title at the organization.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the organization. The type can be custom or  one of these
    * predefined values:  * `work` * `school`
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaOrganization {
  
  inline def apply(): SchemaOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrganization]
  }
  
  extension [Self <: SchemaOrganization](x: Self) {
    
    inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    inline def setJobDescription(value: String): Self = StObject.set(x, "jobDescription", value.asInstanceOf[js.Any])
    
    inline def setJobDescriptionUndefined: Self = StObject.set(x, "jobDescription", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneticName(value: String): Self = StObject.set(x, "phoneticName", value.asInstanceOf[js.Any])
    
    inline def setPhoneticNameUndefined: Self = StObject.set(x, "phoneticName", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
