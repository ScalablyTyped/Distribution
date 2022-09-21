package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.anon.Stops[T]
  - typings.mapboxGl.anon.Type[T]
*/
trait CameraFunctionSpecification[T] extends StObject
object CameraFunctionSpecification {
  
  inline def Stops[T](stops: js.Array[js.Tuple2[Double, T]]): typings.mapboxGl.anon.Stops[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[typings.mapboxGl.anon.Stops[T]]
  }
  
  inline def Type[T](stops: js.Array[js.Tuple2[Double, T]]): typings.mapboxGl.anon.Type[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[typings.mapboxGl.anon.Type[T]]
  }
}
