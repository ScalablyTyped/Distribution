package typings.googleapis.datafusionV1Mod.datafusionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccelerator extends StObject {
  
  /**
    * The type of an accelator for a CDF instance.
    */
  var acceleratorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the accelerator
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccelerator {
  
  inline def apply(): SchemaAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccelerator]
  }
  
  extension [Self <: SchemaAccelerator](x: Self) {
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeNull: Self = StObject.set(x, "acceleratorType", null)
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
