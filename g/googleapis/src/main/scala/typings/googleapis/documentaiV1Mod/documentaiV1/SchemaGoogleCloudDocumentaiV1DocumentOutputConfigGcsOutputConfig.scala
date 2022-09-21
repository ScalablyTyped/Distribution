package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfig extends StObject {
  
  /**
    * The Cloud Storage uri (a directory) of the output.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentOutputConfigGcsOutputConfig](x: Self) {
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
