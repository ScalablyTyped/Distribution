package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuaternion extends StObject {
  
  /**
    * The scalar component.
    */
  var w: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The x component.
    */
  var x: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The y component.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The z component.
    */
  var z: js.UndefOr[Double | Null] = js.undefined
}
object SchemaQuaternion {
  
  inline def apply(): SchemaQuaternion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuaternion]
  }
  
  extension [Self <: SchemaQuaternion](x: Self) {
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWNull: Self = StObject.set(x, "w", null)
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZNull: Self = StObject.set(x, "z", null)
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
