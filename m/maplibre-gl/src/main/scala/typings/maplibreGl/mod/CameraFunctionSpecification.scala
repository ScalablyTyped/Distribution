package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.Stops[T]
  - typings.maplibreGl.anon.Type[T]
*/
trait CameraFunctionSpecification[T]
  extends StObject
     with _DataDrivenPropertyValueSpecification[T]
object CameraFunctionSpecification {
  
  inline def Stops[T](stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreGl.anon.Stops[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.maplibreGl.anon.Stops[T]]
  }
  
  inline def Type[T](stops: js.Array[js.Tuple2[Double, T]]): typings.maplibreGl.anon.Type[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.maplibreGl.anon.Type[T]]
  }
}
