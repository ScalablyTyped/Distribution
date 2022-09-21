package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidationConfig extends StObject {
  
  /**
    * Whether to disable FHIRPath validation for incoming resources. Set this to true to disable checking incoming resources for conformance against FHIRPath requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
    */
  var disableFhirpathValidation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to disable profile validation for this FHIR store. Set this to true to disable checking incoming resources for conformance against structure definitions in this FHIR store.
    */
  var disableProfileValidation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to disable reference type validation for incoming resources. Set this to true to disable checking incoming resources for conformance against reference type requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
    */
  var disableReferenceTypeValidation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to disable required fields validation for incoming resources. Set this to true to disable checking incoming resources for conformance against required fields requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
    */
  var disableRequiredFieldValidation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of implementation guide URLs in this FHIR store that are used to configure the profiles to use for validation. For example, to use the US Core profiles for validation, set `enabled_implementation_guides` to `["http://hl7.org/fhir/us/core/ImplementationGuide/ig"]`. If `enabled_implementation_guides` is empty or omitted, then incoming resources are only required to conform to the base FHIR profiles. Otherwise, a resource must conform to at least one profile listed in the `global` property of one of the enabled ImplementationGuides. The Cloud Healthcare API does not currently enforce all of the rules in a StructureDefinition. The following rules are supported: - min/max - minValue/maxValue - maxLength - type - fixed[x] - pattern[x] on simple types - slicing, when using "value" as the discriminator type When a URL cannot be resolved (for example, in a type assertion), the server does not return an error.
    */
  var enabledImplementationGuides: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaValidationConfig {
  
  inline def apply(): SchemaValidationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidationConfig]
  }
  
  extension [Self <: SchemaValidationConfig](x: Self) {
    
    inline def setDisableFhirpathValidation(value: Boolean): Self = StObject.set(x, "disableFhirpathValidation", value.asInstanceOf[js.Any])
    
    inline def setDisableFhirpathValidationNull: Self = StObject.set(x, "disableFhirpathValidation", null)
    
    inline def setDisableFhirpathValidationUndefined: Self = StObject.set(x, "disableFhirpathValidation", js.undefined)
    
    inline def setDisableProfileValidation(value: Boolean): Self = StObject.set(x, "disableProfileValidation", value.asInstanceOf[js.Any])
    
    inline def setDisableProfileValidationNull: Self = StObject.set(x, "disableProfileValidation", null)
    
    inline def setDisableProfileValidationUndefined: Self = StObject.set(x, "disableProfileValidation", js.undefined)
    
    inline def setDisableReferenceTypeValidation(value: Boolean): Self = StObject.set(x, "disableReferenceTypeValidation", value.asInstanceOf[js.Any])
    
    inline def setDisableReferenceTypeValidationNull: Self = StObject.set(x, "disableReferenceTypeValidation", null)
    
    inline def setDisableReferenceTypeValidationUndefined: Self = StObject.set(x, "disableReferenceTypeValidation", js.undefined)
    
    inline def setDisableRequiredFieldValidation(value: Boolean): Self = StObject.set(x, "disableRequiredFieldValidation", value.asInstanceOf[js.Any])
    
    inline def setDisableRequiredFieldValidationNull: Self = StObject.set(x, "disableRequiredFieldValidation", null)
    
    inline def setDisableRequiredFieldValidationUndefined: Self = StObject.set(x, "disableRequiredFieldValidation", js.undefined)
    
    inline def setEnabledImplementationGuides(value: js.Array[String]): Self = StObject.set(x, "enabledImplementationGuides", value.asInstanceOf[js.Any])
    
    inline def setEnabledImplementationGuidesNull: Self = StObject.set(x, "enabledImplementationGuides", null)
    
    inline def setEnabledImplementationGuidesUndefined: Self = StObject.set(x, "enabledImplementationGuides", js.undefined)
    
    inline def setEnabledImplementationGuidesVarargs(value: String*): Self = StObject.set(x, "enabledImplementationGuides", js.Array(value*))
  }
}
