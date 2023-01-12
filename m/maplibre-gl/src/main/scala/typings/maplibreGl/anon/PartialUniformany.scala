package typings.maplibreGl.anon

import typings.std.WebGLRenderingContext
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<maplibre-gl.maplibre-gl.Uniform<any>> */
trait PartialUniformany extends StObject {
  
  var current: js.UndefOr[Any] = js.undefined
  
  var gl: js.UndefOr[WebGLRenderingContext] = js.undefined
  
  var location: js.UndefOr[WebGLUniformLocation] = js.undefined
  
  var set: js.UndefOr[js.Function1[/* v */ Any, Unit]] = js.undefined
}
object PartialUniformany {
  
  inline def apply(): PartialUniformany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUniformany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialUniformany] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setGl(value: WebGLRenderingContext): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    inline def setLocation(value: WebGLUniformLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSet(value: /* v */ Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
