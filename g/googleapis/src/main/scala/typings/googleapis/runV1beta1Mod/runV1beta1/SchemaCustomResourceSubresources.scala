package typings.googleapis.runV1beta1Mod.runV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomResourceSubresources extends StObject {
  
  /**
    * Scale denotes the scale subresource for CustomResources +optional
    */
  var scale: js.UndefOr[SchemaCustomResourceSubresourceScale] = js.undefined
  
  /**
    * Status denotes the status subresource for CustomResources +optional
    */
  var status: js.UndefOr[SchemaCustomResourceSubresourceStatus] = js.undefined
}
object SchemaCustomResourceSubresources {
  
  inline def apply(): SchemaCustomResourceSubresources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomResourceSubresources]
  }
  
  extension [Self <: SchemaCustomResourceSubresources](x: Self) {
    
    inline def setScale(value: SchemaCustomResourceSubresourceScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStatus(value: SchemaCustomResourceSubresourceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
