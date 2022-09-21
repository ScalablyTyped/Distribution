package typings.maplibreGl.anon

import typings.maplibreGl.mod.RequestParameters
import typings.maplibreGl.mod.RequestTransformFunction
import typings.maplibreGl.mod.ResourceTypeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'transformRequest'>> */
trait RequiredPickMapOptionstraTransformRequest extends StObject {
  
  def transformRequest(url: String): RequestParameters
  def transformRequest(url: String, resourceType: ResourceTypeEnum): RequestParameters
  @JSName("transformRequest")
  var transformRequest_Original: RequestTransformFunction
}
object RequiredPickMapOptionstraTransformRequest {
  
  inline def apply(
    transformRequest: (/* url */ String, /* resourceType */ js.UndefOr[ResourceTypeEnum]) => RequestParameters
  ): RequiredPickMapOptionstraTransformRequest = {
    val __obj = js.Dynamic.literal(transformRequest = js.Any.fromFunction2(transformRequest))
    __obj.asInstanceOf[RequiredPickMapOptionstraTransformRequest]
  }
  
  extension [Self <: RequiredPickMapOptionstraTransformRequest](x: Self) {
    
    inline def setTransformRequest(value: (/* url */ String, /* resourceType */ js.UndefOr[ResourceTypeEnum]) => RequestParameters): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
  }
}
