package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.anon.ValueZoom
import typings.maplibreMaplibreGlStyleSpec.anon.Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DataDrivenPropertyValueSpecification[T] extends StObject
object _DataDrivenPropertyValueSpecification {
  
  inline def Default[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreMaplibreGlStyleSpec.anon.Default[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Default[T]]
  }
  
  inline def DefaultProperty[T](property: String, stops: js.Array[js.Tuple2[String | Double | Boolean, T]]): typings.maplibreMaplibreGlStyleSpec.anon.DefaultProperty[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.DefaultProperty[T]]
  }
  
  inline def DefaultPropertyStops[T](property: String, stops: js.Array[js.Tuple2[ValueZoom, T]]): typings.maplibreMaplibreGlStyleSpec.anon.DefaultPropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.DefaultPropertyStops[T]]
  }
  
  inline def Property[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreMaplibreGlStyleSpec.anon.Property[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Property[T]]
  }
  
  inline def PropertyStops[T](property: String, stops: js.Array[js.Tuple2[Zoom, T]]): typings.maplibreMaplibreGlStyleSpec.anon.PropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.PropertyStops[T]]
  }
  
  inline def PropertyType_[T](property: String): typings.maplibreMaplibreGlStyleSpec.anon.PropertyType_[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.PropertyType_[T]]
  }
  
  inline def Stops[T](stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreMaplibreGlStyleSpec.anon.Stops[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Stops[T]]
  }
  
  inline def StopsType[T](property: String, stops: js.Array[js.Tuple2[Zoom, T]]): typings.maplibreMaplibreGlStyleSpec.anon.StopsType[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.StopsType[T]]
  }
  
  inline def Type[T](stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreMaplibreGlStyleSpec.anon.Type[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Type[T]]
  }
}
