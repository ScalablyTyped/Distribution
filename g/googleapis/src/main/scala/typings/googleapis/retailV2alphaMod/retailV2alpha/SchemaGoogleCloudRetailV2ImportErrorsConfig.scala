package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ImportErrorsConfig extends StObject {
  
  /**
    * Google Cloud Storage prefix for import errors. This must be an empty, existing Cloud Storage directory. Import errors are written to sharded files in this directory, one per line, as a JSON-encoded `google.rpc.Status` message.
    */
  var gcsPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2ImportErrorsConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2ImportErrorsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ImportErrorsConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ImportErrorsConfig](x: Self) {
    
    inline def setGcsPrefix(value: String): Self = StObject.set(x, "gcsPrefix", value.asInstanceOf[js.Any])
    
    inline def setGcsPrefixNull: Self = StObject.set(x, "gcsPrefix", null)
    
    inline def setGcsPrefixUndefined: Self = StObject.set(x, "gcsPrefix", js.undefined)
  }
}
