package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1alpha1AnalyzeHitlDataMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiV1alpha1CommonOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1alpha1AnalyzeHitlDataMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1alpha1AnalyzeHitlDataMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1alpha1AnalyzeHitlDataMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1alpha1AnalyzeHitlDataMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiV1alpha1CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
  }
}
