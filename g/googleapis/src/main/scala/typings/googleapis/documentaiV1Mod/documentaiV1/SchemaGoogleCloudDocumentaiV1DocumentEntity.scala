package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentEntity extends StObject {
  
  /**
    * Optional. Confidence of detected Schema entity. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Canonical id. This will be a unique value in the entity list for this document.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Deprecated. Use `id` field instead.
    */
  var mentionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Text value in the document e.g. `1600 Amphitheatre Pkwy`. If the entity is not present in the document, this field will be empty.
    */
  var mentionText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Normalized entity value. Absent if the extracted value could not be converted or the type (e.g. address) is not supported for certain parsers. This field is also only populated for certain supported document types.
    */
  var normalizedValue: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentEntityNormalizedValue] = js.undefined
  
  /**
    * Optional. Represents the provenance of this entity wrt. the location on the page where it was found.
    */
  var pageAnchor: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageAnchor] = js.undefined
  
  /**
    * Optional. Entities can be nested to form a hierarchical data structure representing the content in the document.
    */
  var properties: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentEntity]] = js.undefined
  
  /**
    * Optional. The history of this annotation.
    */
  var provenance: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentProvenance] = js.undefined
  
  /**
    * Optional. Whether the entity will be redacted for de-identification purposes.
    */
  var redacted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Provenance of the entity. Text anchor indexing into the Document.text.
    */
  var textAnchor: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentTextAnchor] = js.undefined
  
  /**
    * Required. Entity type from a schema e.g. `Address`.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentEntity {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentEntity]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentEntity](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMentionId(value: String): Self = StObject.set(x, "mentionId", value.asInstanceOf[js.Any])
    
    inline def setMentionIdNull: Self = StObject.set(x, "mentionId", null)
    
    inline def setMentionIdUndefined: Self = StObject.set(x, "mentionId", js.undefined)
    
    inline def setMentionText(value: String): Self = StObject.set(x, "mentionText", value.asInstanceOf[js.Any])
    
    inline def setMentionTextNull: Self = StObject.set(x, "mentionText", null)
    
    inline def setMentionTextUndefined: Self = StObject.set(x, "mentionText", js.undefined)
    
    inline def setNormalizedValue(value: SchemaGoogleCloudDocumentaiV1DocumentEntityNormalizedValue): Self = StObject.set(x, "normalizedValue", value.asInstanceOf[js.Any])
    
    inline def setNormalizedValueUndefined: Self = StObject.set(x, "normalizedValue", js.undefined)
    
    inline def setPageAnchor(value: SchemaGoogleCloudDocumentaiV1DocumentPageAnchor): Self = StObject.set(x, "pageAnchor", value.asInstanceOf[js.Any])
    
    inline def setPageAnchorUndefined: Self = StObject.set(x, "pageAnchor", js.undefined)
    
    inline def setProperties(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentEntity]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentEntity*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setProvenance(value: SchemaGoogleCloudDocumentaiV1DocumentProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setRedacted(value: Boolean): Self = StObject.set(x, "redacted", value.asInstanceOf[js.Any])
    
    inline def setRedactedNull: Self = StObject.set(x, "redacted", null)
    
    inline def setRedactedUndefined: Self = StObject.set(x, "redacted", js.undefined)
    
    inline def setTextAnchor(value: SchemaGoogleCloudDocumentaiV1DocumentTextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
