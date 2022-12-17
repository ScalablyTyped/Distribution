package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.Default[T]
  - typings.maplibreGl.anon.Property[T]
  - typings.maplibreGl.anon.DefaultProperty[T]
  - typings.maplibreGl.anon.PropertyType_[T]
*/
trait SourceFunctionSpecification[T]
  extends StObject
     with _DataDrivenPropertyValueSpecification[T]
object SourceFunctionSpecification {
  
  inline def Default[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreGl.anon.Default[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.maplibreGl.anon.Default[T]]
  }
  
  inline def DefaultProperty[T](property: String, stops: js.Array[js.Tuple2[String | Double | Boolean, T]]): typings.maplibreGl.anon.DefaultProperty[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[typings.maplibreGl.anon.DefaultProperty[T]]
  }
  
  inline def Property[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreGl.anon.Property[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.maplibreGl.anon.Property[T]]
  }
  
  inline def PropertyType_[T](property: String): typings.maplibreGl.anon.PropertyType_[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identity")
    __obj.asInstanceOf[typings.maplibreGl.anon.PropertyType_[T]]
  }
}
