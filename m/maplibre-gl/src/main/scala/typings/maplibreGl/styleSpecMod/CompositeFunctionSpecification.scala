package typings.maplibreGl.styleSpecMod

import typings.maplibreGl.anon.Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.PropertyStops[T]
  - typings.maplibreGl.anon.StopsType[T]
  - typings.maplibreGl.anon.DefaultPropertyStops[T]
*/
trait CompositeFunctionSpecification[T]
  extends StObject
     with _DataDrivenPropertyValueSpecification[T]
object CompositeFunctionSpecification {
  
  inline def DefaultPropertyStops[T](property: String, stops: js.Array[js.Tuple2[Zoom, T]]): typings.maplibreGl.anon.DefaultPropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typings.maplibreGl.anon.DefaultPropertyStops[T]]
  }
  
  inline def PropertyStops[T](property: String, stops: js.Array[js.Tuple2[typings.maplibreGl.anon.Value, T]]): typings.maplibreGl.anon.PropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.maplibreGl.anon.PropertyStops[T]]
  }
  
  inline def StopsType[T](property: String, stops: js.Array[js.Tuple2[typings.maplibreGl.anon.Value, T]]): typings.maplibreGl.anon.StopsType[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.maplibreGl.anon.StopsType[T]]
  }
}
