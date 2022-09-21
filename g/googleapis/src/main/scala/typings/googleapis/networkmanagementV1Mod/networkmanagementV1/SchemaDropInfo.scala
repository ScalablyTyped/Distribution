package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDropInfo extends StObject {
  
  /**
    * Cause that the packet is dropped.
    */
  var cause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of the resource that caused the drop.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaDropInfo {
  
  inline def apply(): SchemaDropInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDropInfo]
  }
  
  extension [Self <: SchemaDropInfo](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseNull: Self = StObject.set(x, "cause", null)
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
