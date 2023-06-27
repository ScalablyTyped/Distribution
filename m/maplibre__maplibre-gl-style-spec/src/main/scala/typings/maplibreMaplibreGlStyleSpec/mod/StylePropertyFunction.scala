package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.anon.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@maplibre/maplibre-gl-style-spec", "StylePropertyFunction")
@js.native
open class StylePropertyFunction[T] protected () extends StObject {
  def this(parameters: PropertyValueSpecification[T], specification: StylePropertySpecification) = this()
  
  var _parameters: PropertyValueSpecification[T] = js.native
  
  var _specification: StylePropertySpecification = js.native
  
  def evaluate(globals: GlobalProperties): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature): Any = js.native
  
  def interpolationFactor(input: Double, lower: Double, upper: Double): Double = js.native
  
  var kind: EvaluationKind = js.native
  
  var zoomStops: js.Array[Double] = js.native
}
/* static members */
object StylePropertyFunction {
  
  @JSImport("@maplibre/maplibre-gl-style-spec", "StylePropertyFunction")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize[T](serialized: Parameters[T]): StylePropertyFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(serialized.asInstanceOf[js.Any]).asInstanceOf[StylePropertyFunction[T]]
  
  inline def serialize[T](input: StylePropertyFunction[T]): Parameters[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(input.asInstanceOf[js.Any]).asInstanceOf[Parameters[T]]
}
