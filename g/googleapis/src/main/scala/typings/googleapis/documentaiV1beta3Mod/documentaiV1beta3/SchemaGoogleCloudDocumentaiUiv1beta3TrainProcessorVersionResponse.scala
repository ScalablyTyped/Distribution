package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionResponse extends StObject {
  
  /**
    * The resource name of the processor version produced by training.
    */
  var processorVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3TrainProcessorVersionResponse](x: Self) {
    
    inline def setProcessorVersion(value: String): Self = StObject.set(x, "processorVersion", value.asInstanceOf[js.Any])
    
    inline def setProcessorVersionNull: Self = StObject.set(x, "processorVersion", null)
    
    inline def setProcessorVersionUndefined: Self = StObject.set(x, "processorVersion", js.undefined)
  }
}
