package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaMetadata extends StObject {
  
  /**
    * If true, on a given page, there can be multiple `document` annotations covering it.
    */
  var documentAllowMultipleLabels: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, a `document` entity type can be applied to subdocument ( splitting). Otherwise, it can only be applied to the entire document (classification).
    */
  var documentSplitter: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set, all the nested entities must be prefixed with the parents.
    */
  var prefixedNamingOnProperties: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set, we will skip the naming format validation in the schema. So the string values in `DocumentSchema.EntityType.name` and `DocumentSchema.EntityType.Property.name` will not be checked.
    */
  var skipNamingValidation: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentSchemaMetadata](x: Self) {
    
    inline def setDocumentAllowMultipleLabels(value: Boolean): Self = StObject.set(x, "documentAllowMultipleLabels", value.asInstanceOf[js.Any])
    
    inline def setDocumentAllowMultipleLabelsNull: Self = StObject.set(x, "documentAllowMultipleLabels", null)
    
    inline def setDocumentAllowMultipleLabelsUndefined: Self = StObject.set(x, "documentAllowMultipleLabels", js.undefined)
    
    inline def setDocumentSplitter(value: Boolean): Self = StObject.set(x, "documentSplitter", value.asInstanceOf[js.Any])
    
    inline def setDocumentSplitterNull: Self = StObject.set(x, "documentSplitter", null)
    
    inline def setDocumentSplitterUndefined: Self = StObject.set(x, "documentSplitter", js.undefined)
    
    inline def setPrefixedNamingOnProperties(value: Boolean): Self = StObject.set(x, "prefixedNamingOnProperties", value.asInstanceOf[js.Any])
    
    inline def setPrefixedNamingOnPropertiesNull: Self = StObject.set(x, "prefixedNamingOnProperties", null)
    
    inline def setPrefixedNamingOnPropertiesUndefined: Self = StObject.set(x, "prefixedNamingOnProperties", js.undefined)
    
    inline def setSkipNamingValidation(value: Boolean): Self = StObject.set(x, "skipNamingValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipNamingValidationNull: Self = StObject.set(x, "skipNamingValidation", null)
    
    inline def setSkipNamingValidationUndefined: Self = StObject.set(x, "skipNamingValidation", js.undefined)
  }
}
