package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaExportErrorsConfig extends StObject {
  
  /**
    * Google Cloud Storage path for import errors. This must be an empty, existing Cloud Storage bucket. Export errors will be written to a file in this bucket, one per line, as a JSON-encoded `google.rpc.Status` message.
    */
  var gcsPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaExportErrorsConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaExportErrorsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaExportErrorsConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaExportErrorsConfig](x: Self) {
    
    inline def setGcsPrefix(value: String): Self = StObject.set(x, "gcsPrefix", value.asInstanceOf[js.Any])
    
    inline def setGcsPrefixNull: Self = StObject.set(x, "gcsPrefix", null)
    
    inline def setGcsPrefixUndefined: Self = StObject.set(x, "gcsPrefix", js.undefined)
  }
}
