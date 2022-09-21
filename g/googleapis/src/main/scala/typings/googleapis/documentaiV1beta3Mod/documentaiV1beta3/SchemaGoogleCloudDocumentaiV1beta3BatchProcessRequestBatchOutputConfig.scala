package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchOutputConfig extends StObject {
  
  /**
    * The output Cloud Storage directory to put the processed documents.
    */
  var gcsDestination: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchOutputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchOutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchOutputConfig](x: Self) {
    
    inline def setGcsDestination(value: String): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationNull: Self = StObject.set(x, "gcsDestination", null)
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
