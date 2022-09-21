package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDocsMetadata extends StObject {
  
  /** Contains number of users and groups which can access the document. */
  var aclInfo: js.UndefOr[AclInfo] = js.undefined
  
  /** The conceptual type (presentation, document, etc.) of this document. */
  var documentType: js.UndefOr[String] = js.undefined
  
  /** The file extension of the document. NOTE: As of October 2018 this field is not backfilled for old documents. */
  var fileExtension: js.UndefOr[String] = js.undefined
  
  /** The last time this document was modified, in seconds since epoch. Only counts content modifications. */
  var lastContentModifiedTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Additional per-result information, akin to Gmail's SingleThreadResponse. Note: GWS no longer seems to use this field, but there's still one reference to it for Scribe, so we can't
    * remove it.
    */
  var resultInfo: js.UndefOr[GoogleDocsResultInfo] = js.undefined
  
  /** Contains additional information about the document depending on its type. */
  var typeInfo: js.UndefOr[TypeInfo] = js.undefined
}
object GoogleDocsMetadata {
  
  inline def apply(): GoogleDocsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDocsMetadata]
  }
  
  extension [Self <: GoogleDocsMetadata](x: Self) {
    
    inline def setAclInfo(value: AclInfo): Self = StObject.set(x, "aclInfo", value.asInstanceOf[js.Any])
    
    inline def setAclInfoUndefined: Self = StObject.set(x, "aclInfo", js.undefined)
    
    inline def setDocumentType(value: String): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
    
    inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    inline def setLastContentModifiedTimestamp(value: String): Self = StObject.set(x, "lastContentModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastContentModifiedTimestampUndefined: Self = StObject.set(x, "lastContentModifiedTimestamp", js.undefined)
    
    inline def setResultInfo(value: GoogleDocsResultInfo): Self = StObject.set(x, "resultInfo", value.asInstanceOf[js.Any])
    
    inline def setResultInfoUndefined: Self = StObject.set(x, "resultInfo", js.undefined)
    
    inline def setTypeInfo(value: TypeInfo): Self = StObject.set(x, "typeInfo", value.asInstanceOf[js.Any])
    
    inline def setTypeInfoUndefined: Self = StObject.set(x, "typeInfo", js.undefined)
  }
}
