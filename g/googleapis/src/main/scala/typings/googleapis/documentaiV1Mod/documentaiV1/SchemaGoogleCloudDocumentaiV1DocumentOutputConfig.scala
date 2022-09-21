package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentOutputConfig extends StObject {
  
  /**
    * Output config to write the results to Cloud Storage.
    */
  var gcsOutputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfig] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentOutputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentOutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentOutputConfig](x: Self) {
    
    inline def setGcsOutputConfig(value: SchemaGoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfig): Self = StObject.set(x, "gcsOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setGcsOutputConfigUndefined: Self = StObject.set(x, "gcsOutputConfig", js.undefined)
  }
}
