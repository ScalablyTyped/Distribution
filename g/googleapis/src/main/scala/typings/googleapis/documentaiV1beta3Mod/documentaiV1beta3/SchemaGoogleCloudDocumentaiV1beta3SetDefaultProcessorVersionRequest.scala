package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3SetDefaultProcessorVersionRequest extends StObject {
  
  /**
    * Required. The resource name of child ProcessorVersion to use as default. Format: `projects/{project\}/locations/{location\}/processors/{processor\}/processorVersions/{version\}`
    */
  var defaultProcessorVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3SetDefaultProcessorVersionRequest {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3SetDefaultProcessorVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3SetDefaultProcessorVersionRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3SetDefaultProcessorVersionRequest](x: Self) {
    
    inline def setDefaultProcessorVersion(value: String): Self = StObject.set(x, "defaultProcessorVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultProcessorVersionNull: Self = StObject.set(x, "defaultProcessorVersion", null)
    
    inline def setDefaultProcessorVersionUndefined: Self = StObject.set(x, "defaultProcessorVersion", js.undefined)
  }
}
