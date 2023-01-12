package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined konva.konva/lib/types.Vector2d & {  id :number} */
trait Vector2didnumber extends StObject {
  
  var id: Double
  
  var x: Double
  
  var y: Double
}
object Vector2didnumber {
  
  inline def apply(id: Double, x: Double, y: Double): Vector2didnumber = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2didnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vector2didnumber] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
