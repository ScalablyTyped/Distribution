package typings.maplibreGl.anon

import typings.glMatrix.mod.mat4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dirty extends StObject {
  
  var dirty: Boolean
  
  var matrix: mat4
  
  var renderTime: Double
}
object Dirty {
  
  inline def apply(dirty: Boolean, matrix: mat4, renderTime: Double): Dirty = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], renderTime = renderTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dirty] (val x: Self) extends AnyVal {
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: mat4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setRenderTime(value: Double): Self = StObject.set(x, "renderTime", value.asInstanceOf[js.Any])
  }
}
