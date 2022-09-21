package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccelerator extends StObject {
  
  /**
    * The type of an accelator for a CDF instance.
    */
  var acceleratorType: js.UndefOr[String | Null] = js.undefined
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
  }
}
