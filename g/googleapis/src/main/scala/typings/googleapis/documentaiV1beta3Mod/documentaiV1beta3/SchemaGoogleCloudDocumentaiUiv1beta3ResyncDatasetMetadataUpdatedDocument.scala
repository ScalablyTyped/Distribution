package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument extends StObject {
  
  /**
    * The prefix of cloud storage, identifies the destination document which should be updated by resync pipeline.
    */
  var destinationPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The prefix of cloud storage, identifies the original document which should be updated by resync pipeline.
    */
  var sourcePrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The final status of the documents which should be updated by resync pipeline.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ResyncDatasetMetadataUpdatedDocument](x: Self) {
    
    inline def setDestinationPrefix(value: String): Self = StObject.set(x, "destinationPrefix", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixNull: Self = StObject.set(x, "destinationPrefix", null)
    
    inline def setDestinationPrefixUndefined: Self = StObject.set(x, "destinationPrefix", js.undefined)
    
    inline def setSourcePrefix(value: String): Self = StObject.set(x, "sourcePrefix", value.asInstanceOf[js.Any])
    
    inline def setSourcePrefixNull: Self = StObject.set(x, "sourcePrefix", null)
    
    inline def setSourcePrefixUndefined: Self = StObject.set(x, "sourcePrefix", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
