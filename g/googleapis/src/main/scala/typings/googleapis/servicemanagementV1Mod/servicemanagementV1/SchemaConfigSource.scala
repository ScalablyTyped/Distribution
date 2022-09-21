package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigSource extends StObject {
  
  /**
    * Set of source configuration files that are used to generate a service configuration (`google.api.Service`).
    */
  var files: js.UndefOr[js.Array[SchemaConfigFile]] = js.undefined
  
  /**
    * A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. If empty, the server may choose to generate one instead.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigSource {
  
  inline def apply(): SchemaConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigSource]
  }
  
  extension [Self <: SchemaConfigSource](x: Self) {
    
    inline def setFiles(value: js.Array[SchemaConfigFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaConfigFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
