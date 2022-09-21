package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcceleratorConfig extends StObject {
  
  /**
    * Count of cores of this accelerator.
    */
  var coreCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this accelerator.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAcceleratorConfig {
  
  inline def apply(): SchemaAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorConfig]
  }
  
  extension [Self <: SchemaAcceleratorConfig](x: Self) {
    
    inline def setCoreCount(value: String): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountNull: Self = StObject.set(x, "coreCount", null)
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
