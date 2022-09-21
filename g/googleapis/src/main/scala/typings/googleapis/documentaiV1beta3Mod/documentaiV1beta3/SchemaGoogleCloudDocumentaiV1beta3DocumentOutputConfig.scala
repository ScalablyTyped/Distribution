package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfig extends StObject {
  
  /**
    * Output config to write the results to Cloud Storage.
    */
  var gcsOutputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfigGcsOutputConfig] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfig](x: Self) {
    
    inline def setGcsOutputConfig(value: SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfigGcsOutputConfig): Self = StObject.set(x, "gcsOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setGcsOutputConfigUndefined: Self = StObject.set(x, "gcsOutputConfig", js.undefined)
  }
}
