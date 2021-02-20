package typings.konva.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined konva.konva/types/types.Vector2d & {  id :number | undefined} */
@js.native
trait Vector2didnumberundefined extends StObject {
  
  var id: js.UndefOr[Double] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Vector2didnumberundefined {
  
  @scala.inline
  def apply(x: Double, y: Double): Vector2didnumberundefined = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2didnumberundefined]
  }
  
  @scala.inline
  implicit class Vector2didnumberundefinedMutableBuilder[Self <: Vector2didnumberundefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
