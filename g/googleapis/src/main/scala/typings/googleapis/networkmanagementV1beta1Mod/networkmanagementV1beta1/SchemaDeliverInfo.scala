package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliverInfo extends StObject {
  
  /**
    * URI of the resource that the packet is delivered to.
    */
  var resourceUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target type where the packet is delivered to.
    */
  var target: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliverInfo {
  
  inline def apply(): SchemaDeliverInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliverInfo]
  }
  
  extension [Self <: SchemaDeliverInfo](x: Self) {
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
