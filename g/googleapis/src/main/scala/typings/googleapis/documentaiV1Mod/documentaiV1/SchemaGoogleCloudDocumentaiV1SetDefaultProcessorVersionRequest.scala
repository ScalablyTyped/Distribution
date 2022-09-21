package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest extends StObject {
  
  /**
    * Required. The resource name of child ProcessorVersion to use as default. Format: `projects/{project\}/locations/{location\}/processors/{processor\}/processorVersions/{version\}`
    */
  var defaultProcessorVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1SetDefaultProcessorVersionRequest](x: Self) {
    
    inline def setDefaultProcessorVersion(value: String): Self = StObject.set(x, "defaultProcessorVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultProcessorVersionNull: Self = StObject.set(x, "defaultProcessorVersion", null)
    
    inline def setDefaultProcessorVersionUndefined: Self = StObject.set(x, "defaultProcessorVersion", js.undefined)
  }
}
