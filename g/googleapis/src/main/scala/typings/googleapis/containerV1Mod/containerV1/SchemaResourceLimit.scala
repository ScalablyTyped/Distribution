package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceLimit extends StObject {
  
  /**
    * Maximum amount of the resource in the cluster.
    */
  var maximum: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum amount of the resource in the cluster.
    */
  var minimum: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name "cpu", "memory" or gpu-specific string.
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceLimit {
  
  inline def apply(): SchemaResourceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceLimit]
  }
  
  extension [Self <: SchemaResourceLimit](x: Self) {
    
    inline def setMaximum(value: String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumNull: Self = StObject.set(x, "maximum", null)
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumNull: Self = StObject.set(x, "minimum", null)
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
