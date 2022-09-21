package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceGetMetadataRequest extends StObject {
  
  /**
    * Specification of the source whose metadata should be computed.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
}
object SchemaSourceGetMetadataRequest {
  
  inline def apply(): SchemaSourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceGetMetadataRequest]
  }
  
  extension [Self <: SchemaSourceGetMetadataRequest](x: Self) {
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
