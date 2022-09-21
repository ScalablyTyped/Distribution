package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfigGcsOutputConfig extends StObject {
  
  /**
    * The Cloud Storage uri (a directory) of the output.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfigGcsOutputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfigGcsOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfigGcsOutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentOutputConfigGcsOutputConfig](x: Self) {
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
