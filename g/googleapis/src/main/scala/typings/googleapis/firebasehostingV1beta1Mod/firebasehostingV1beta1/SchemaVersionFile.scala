package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionFile extends StObject {
  
  /**
    * The SHA256 content hash of the file.
    */
  var hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI at which the file's content should display.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current status of a particular file in the specified version. The value will be either `pending upload` or `uploaded`.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaVersionFile {
  
  inline def apply(): SchemaVersionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionFile]
  }
  
  extension [Self <: SchemaVersionFile](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashNull: Self = StObject.set(x, "hash", null)
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
