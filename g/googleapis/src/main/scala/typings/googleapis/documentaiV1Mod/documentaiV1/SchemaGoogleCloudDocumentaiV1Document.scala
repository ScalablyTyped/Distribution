package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1Document extends StObject {
  
  /**
    * Optional. Inline document content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers use a pure binary representation, whereas JSON representations use base64.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of entities detected on Document.text. For document shards, entities in this list may cross shard boundaries.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentEntity]] = js.undefined
  
  /**
    * Placeholder. Relationship among Document.entities.
    */
  var entityRelations: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentEntityRelation]] = js.undefined
  
  /**
    * Any error that occurred while processing this document.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * An IANA published MIME type (also referred to as media type). For more information, see https://www.iana.org/assignments/media-types/media-types.xhtml.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Visual page layout for the Document.
    */
  var pages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPage]] = js.undefined
  
  /**
    * Placeholder. Revision history of this document.
    */
  var revisions: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentRevision]] = js.undefined
  
  /**
    * Information about the sharding if this document is sharded part of a larger document. If the document is not sharded, this message is not specified.
    */
  var shardInfo: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentShardInfo] = js.undefined
  
  /**
    * Optional. UTF-8 encoded text in reading order from the document.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Placeholder. A list of text corrections made to [Document.text]. This is usually used for annotating corrections to OCR mistakes. Text changes for a given revision may not overlap with each other.
    */
  var textChanges: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentTextChange]] = js.undefined
  
  /**
    * Placeholder. Styles for the Document.text.
    */
  var textStyles: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentStyle]] = js.undefined
  
  /**
    * Optional. Currently supports Google Cloud Storage URI of the form `gs://bucket_name/object_name`. Object versioning is not supported. See [Google Cloud Storage Request URIs](https://cloud.google.com/storage/docs/reference-uris) for more info.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1Document {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1Document]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1Document](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEntities(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentEntity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEntityRelations(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentEntityRelation]): Self = StObject.set(x, "entityRelations", value.asInstanceOf[js.Any])
    
    inline def setEntityRelationsUndefined: Self = StObject.set(x, "entityRelations", js.undefined)
    
    inline def setEntityRelationsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentEntityRelation*): Self = StObject.set(x, "entityRelations", js.Array(value*))
    
    inline def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setPages(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPage*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setRevisions(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentRevision]): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentRevision*): Self = StObject.set(x, "revisions", js.Array(value*))
    
    inline def setShardInfo(value: SchemaGoogleCloudDocumentaiV1DocumentShardInfo): Self = StObject.set(x, "shardInfo", value.asInstanceOf[js.Any])
    
    inline def setShardInfoUndefined: Self = StObject.set(x, "shardInfo", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextChanges(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentTextChange]): Self = StObject.set(x, "textChanges", value.asInstanceOf[js.Any])
    
    inline def setTextChangesUndefined: Self = StObject.set(x, "textChanges", js.undefined)
    
    inline def setTextChangesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentTextChange*): Self = StObject.set(x, "textChanges", js.Array(value*))
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextStyles(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentStyle]): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    inline def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    inline def setTextStylesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentStyle*): Self = StObject.set(x, "textStyles", js.Array(value*))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
