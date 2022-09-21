package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateAuthorityPolicy extends StObject {
  
  /**
    * Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
    */
  var allowedCommonNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
    */
  var allowedConfigList: js.UndefOr[SchemaAllowedConfigList] = js.undefined
  
  /**
    * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
    */
  var allowedIssuanceModes: js.UndefOr[SchemaIssuanceModes] = js.undefined
  
  /**
    * Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
    */
  var allowedLocationsAndOrganizations: js.UndefOr[js.Array[SchemaSubject]] = js.undefined
  
  /**
    * Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
    */
  var allowedSans: js.UndefOr[SchemaAllowedSubjectAltNames] = js.undefined
  
  /**
    * Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate's requested maximum_lifetime, the effective lifetime will be explicitly truncated.
    */
  var maximumLifetime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
    */
  var overwriteConfigValues: js.UndefOr[SchemaReusableConfigWrapper] = js.undefined
}
object SchemaCertificateAuthorityPolicy {
  
  inline def apply(): SchemaCertificateAuthorityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateAuthorityPolicy]
  }
  
  extension [Self <: SchemaCertificateAuthorityPolicy](x: Self) {
    
    inline def setAllowedCommonNames(value: js.Array[String]): Self = StObject.set(x, "allowedCommonNames", value.asInstanceOf[js.Any])
    
    inline def setAllowedCommonNamesNull: Self = StObject.set(x, "allowedCommonNames", null)
    
    inline def setAllowedCommonNamesUndefined: Self = StObject.set(x, "allowedCommonNames", js.undefined)
    
    inline def setAllowedCommonNamesVarargs(value: String*): Self = StObject.set(x, "allowedCommonNames", js.Array(value*))
    
    inline def setAllowedConfigList(value: SchemaAllowedConfigList): Self = StObject.set(x, "allowedConfigList", value.asInstanceOf[js.Any])
    
    inline def setAllowedConfigListUndefined: Self = StObject.set(x, "allowedConfigList", js.undefined)
    
    inline def setAllowedIssuanceModes(value: SchemaIssuanceModes): Self = StObject.set(x, "allowedIssuanceModes", value.asInstanceOf[js.Any])
    
    inline def setAllowedIssuanceModesUndefined: Self = StObject.set(x, "allowedIssuanceModes", js.undefined)
    
    inline def setAllowedLocationsAndOrganizations(value: js.Array[SchemaSubject]): Self = StObject.set(x, "allowedLocationsAndOrganizations", value.asInstanceOf[js.Any])
    
    inline def setAllowedLocationsAndOrganizationsUndefined: Self = StObject.set(x, "allowedLocationsAndOrganizations", js.undefined)
    
    inline def setAllowedLocationsAndOrganizationsVarargs(value: SchemaSubject*): Self = StObject.set(x, "allowedLocationsAndOrganizations", js.Array(value*))
    
    inline def setAllowedSans(value: SchemaAllowedSubjectAltNames): Self = StObject.set(x, "allowedSans", value.asInstanceOf[js.Any])
    
    inline def setAllowedSansUndefined: Self = StObject.set(x, "allowedSans", js.undefined)
    
    inline def setMaximumLifetime(value: String): Self = StObject.set(x, "maximumLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaximumLifetimeNull: Self = StObject.set(x, "maximumLifetime", null)
    
    inline def setMaximumLifetimeUndefined: Self = StObject.set(x, "maximumLifetime", js.undefined)
    
    inline def setOverwriteConfigValues(value: SchemaReusableConfigWrapper): Self = StObject.set(x, "overwriteConfigValues", value.asInstanceOf[js.Any])
    
    inline def setOverwriteConfigValuesUndefined: Self = StObject.set(x, "overwriteConfigValues", js.undefined)
  }
}
