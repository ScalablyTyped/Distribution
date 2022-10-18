package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.anon.Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.Default[T]
  - typings.maplibreGl.anon.Property[T]
  - typings.maplibreGl.anon.DefaultProperty[T]
*/
trait CompositeFunctionSpecification[T]
  extends StObject
     with _DataDrivenPropertyValueSpecification[T]
object CompositeFunctionSpecification {
  
  inline def Default[T](property: String, stops: js.Array[js.Tuple2[typings.maplibreGl.anon.Value, T]]): typings.maplibreGl.anon.Default[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.maplibreGl.anon.Default[T]]
  }
  
  inline def DefaultProperty[T](property: String, stops: js.Array[js.Tuple2[Zoom, T]]): typings.maplibreGl.anon.DefaultProperty[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typings.maplibreGl.anon.DefaultProperty[T]]
  }
  
  inline def Property[T](property: String, stops: js.Array[js.Tuple2[typings.maplibreGl.anon.Value, T]]): typings.maplibreGl.anon.Property[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.maplibreGl.anon.Property[T]]
  }
}
