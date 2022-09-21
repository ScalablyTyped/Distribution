package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1UndeployProcessorVersionMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiV1CommonOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1UndeployProcessorVersionMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1UndeployProcessorVersionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1UndeployProcessorVersionMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1UndeployProcessorVersionMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiV1CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
  }
}
