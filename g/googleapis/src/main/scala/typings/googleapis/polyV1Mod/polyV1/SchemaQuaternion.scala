package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [Quaternion](//en.wikipedia.org/wiki/Quaternion). Please note: if in the
  * response you see &quot;w: 1&quot; and nothing else this is the default
  * value of [0, 0, 0, 1] where x,y, and z are 0.
  */
trait SchemaQuaternion extends StObject {
  
  /**
    * The scalar component.
    */
  var w: js.UndefOr[Double] = js.undefined
  
  /**
    * The x component.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The y component.
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * The z component.
    */
  var z: js.UndefOr[Double] = js.undefined
}
object SchemaQuaternion {
  
  inline def apply(): SchemaQuaternion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuaternion]
  }
  
  extension [Self <: SchemaQuaternion](x: Self) {
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
