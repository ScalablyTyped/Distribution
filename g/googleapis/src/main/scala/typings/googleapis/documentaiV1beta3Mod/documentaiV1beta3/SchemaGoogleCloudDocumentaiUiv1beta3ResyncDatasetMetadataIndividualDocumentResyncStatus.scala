package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus extends StObject {
  
  /**
    * The document identifier.
    */
  var documentId: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3DocumentId] = js.undefined
  
  /**
    * The type of document inconsistency.
    */
  var documentInconsistencyType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status of resyncing the document with regards to the detected inconsistency. Empty if `validate_only` is true in the request.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataIndividualDocumentResyncStatus](x: Self) {
    
    inline def setDocumentId(value: SchemaGoogleCloudDocumentaiUiv1beta3DocumentId): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setDocumentInconsistencyType(value: String): Self = StObject.set(x, "documentInconsistencyType", value.asInstanceOf[js.Any])
    
    inline def setDocumentInconsistencyTypeNull: Self = StObject.set(x, "documentInconsistencyType", null)
    
    inline def setDocumentInconsistencyTypeUndefined: Self = StObject.set(x, "documentInconsistencyType", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
