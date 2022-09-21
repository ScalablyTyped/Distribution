package typings.maplibreGl.anon

import typings.maplibreGl.mod.RequestParameters
import typings.maplibreGl.mod.RequestTransformFunction
import typings.maplibreGl.mod.ResourceTypeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'transformRequest'> */
trait PickMapOptionstransformRe extends StObject {
  
  var transformRequest: js.UndefOr[RequestTransformFunction] = js.undefined
}
object PickMapOptionstransformRe {
  
  inline def apply(): PickMapOptionstransformRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionstransformRe]
  }
  
  extension [Self <: PickMapOptionstransformRe](x: Self) {
    
    inline def setTransformRequest(value: (/* url */ String, /* resourceType */ js.UndefOr[ResourceTypeEnum]) => RequestParameters): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
  }
}
