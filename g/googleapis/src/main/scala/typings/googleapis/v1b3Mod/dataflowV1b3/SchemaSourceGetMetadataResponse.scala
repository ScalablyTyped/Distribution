package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a SourceGetMetadataOperation.
  */
trait SchemaSourceGetMetadataResponse extends StObject {
  
  /**
    * The computed metadata.
    */
  var metadata: js.UndefOr[SchemaSourceMetadata] = js.undefined
}
object SchemaSourceGetMetadataResponse {
  
  inline def apply(): SchemaSourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceGetMetadataResponse]
  }
  
  extension [Self <: SchemaSourceGetMetadataResponse](x: Self) {
    
    inline def setMetadata(value: SchemaSourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
