package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylePropertyFunction[T] extends StObject {
  
  var _parameters: PropertyValueSpecification[T] = js.native
  
  var _specification: StylePropertySpecification = js.native
  
  def evaluate(globals: GlobalProperties): Any = js.native
  def evaluate(globals: GlobalProperties, feature: Feature): Any = js.native
  
  def interpolationFactor(input: Double, lower: Double, upper: Double): Double = js.native
  
  var kind: EvaluationKind = js.native
  
  var zoomStops: js.Array[Double] = js.native
}
