package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFhirConfig extends StObject {
  
  /**
    * The behaviour for handling FHIR extensions that aren't otherwise specified for de-identification. If true, all extensions are preserved during de-identification by default. If false or unspecified, all extensions are removed during de-identification by default.
    */
  var defaultKeepExtensions: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies FHIR paths to match and how to transform them. Any field that is not matched by a FieldMetadata is passed through to the output dataset unmodified. All extensions will be processed according to `default_keep_extensions`.
    */
  var fieldMetadataList: js.UndefOr[js.Array[SchemaFieldMetadata]] = js.undefined
}
object SchemaFhirConfig {
  
  inline def apply(): SchemaFhirConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFhirConfig]
  }
  
  extension [Self <: SchemaFhirConfig](x: Self) {
    
    inline def setDefaultKeepExtensions(value: Boolean): Self = StObject.set(x, "defaultKeepExtensions", value.asInstanceOf[js.Any])
    
    inline def setDefaultKeepExtensionsNull: Self = StObject.set(x, "defaultKeepExtensions", null)
    
    inline def setDefaultKeepExtensionsUndefined: Self = StObject.set(x, "defaultKeepExtensions", js.undefined)
    
    inline def setFieldMetadataList(value: js.Array[SchemaFieldMetadata]): Self = StObject.set(x, "fieldMetadataList", value.asInstanceOf[js.Any])
    
    inline def setFieldMetadataListUndefined: Self = StObject.set(x, "fieldMetadataList", js.undefined)
    
    inline def setFieldMetadataListVarargs(value: SchemaFieldMetadata*): Self = StObject.set(x, "fieldMetadataList", js.Array(value*))
  }
}
