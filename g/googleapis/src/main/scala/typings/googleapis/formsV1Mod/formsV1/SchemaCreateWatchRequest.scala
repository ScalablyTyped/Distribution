package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateWatchRequest extends StObject {
  
  /**
    * Required. The watch object. No ID should be set on this object; use `watch_id` instead.
    */
  var watch: js.UndefOr[SchemaWatch] = js.undefined
  
  /**
    * The ID to use for the watch. If specified, the ID must not already be in use. If not specified, an ID is generated. This value should be 4-63 characters, and valid characters are /a-z-/.
    */
  var watchId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateWatchRequest {
  
  inline def apply(): SchemaCreateWatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateWatchRequest]
  }
  
  extension [Self <: SchemaCreateWatchRequest](x: Self) {
    
    inline def setWatch(value: SchemaWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchId(value: String): Self = StObject.set(x, "watchId", value.asInstanceOf[js.Any])
    
    inline def setWatchIdNull: Self = StObject.set(x, "watchId", null)
    
    inline def setWatchIdUndefined: Self = StObject.set(x, "watchId", js.undefined)
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
