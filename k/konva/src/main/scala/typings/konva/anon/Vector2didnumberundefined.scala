package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined konva.konva/lib/types.Vector2d & {  id :number | undefined} */
trait Vector2didnumberundefined extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var x: Double
  
  var y: Double
}
object Vector2didnumberundefined {
  
  inline def apply(x: Double, y: Double): Vector2didnumberundefined = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2didnumberundefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vector2didnumberundefined] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
