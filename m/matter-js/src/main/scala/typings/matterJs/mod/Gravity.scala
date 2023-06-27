package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gravity extends StObject {
  
  /**
    * The gravity scale factor.
    *
    * @default 0.001
    */
  var scale: Double
  
  /**
    * The gravity x component.
    *
    * @default 0
    */
  var x: Double
  
  /**
    * The gravity y component.
    *
    * @default 1
    */
  var y: Double
}
object Gravity {
  
  inline def apply(scale: Double, x: Double, y: Double): Gravity = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gravity] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
