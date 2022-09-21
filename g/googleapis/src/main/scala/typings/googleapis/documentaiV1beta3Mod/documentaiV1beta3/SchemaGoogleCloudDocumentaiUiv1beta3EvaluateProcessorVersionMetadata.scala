package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionMetadata extends StObject {
  
  /**
    * The basic metadata of the long running operation.
    */
  var commonMetadata: js.UndefOr[SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionMetadata {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3EvaluateProcessorVersionMetadata](x: Self) {
    
    inline def setCommonMetadata(value: SchemaGoogleCloudDocumentaiUiv1beta3CommonOperationMetadata): Self = StObject.set(x, "commonMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommonMetadataUndefined: Self = StObject.set(x, "commonMetadata", js.undefined)
  }
}
