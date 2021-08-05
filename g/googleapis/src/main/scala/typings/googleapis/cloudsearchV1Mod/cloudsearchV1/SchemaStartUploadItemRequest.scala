package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Start upload file request.
  */
trait SchemaStartUploadItemRequest extends StObject {
  
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
}
object SchemaStartUploadItemRequest {
  
  inline def apply(): SchemaStartUploadItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartUploadItemRequest]
  }
  
  extension [Self <: SchemaStartUploadItemRequest](x: Self) {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
  }
}
