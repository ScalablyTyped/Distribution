package typings.maplibreGl.mod

import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uniform[T] extends StObject {
  
  var current: T
  
  var gl: WebGLRenderingContext
  
  var location: WebGLUniformLocation
  
  def set(v: T): scala.Unit
}
object Uniform {
  
  inline def apply[T](current: T, gl: WebGLRenderingContext, location: WebGLUniformLocation, set: T => scala.Unit): Uniform[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], gl = gl.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Uniform[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Uniform[?], T] (val x: Self & Uniform[T]) extends AnyVal {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: WebGLUniformLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setSet(value: T => scala.Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
